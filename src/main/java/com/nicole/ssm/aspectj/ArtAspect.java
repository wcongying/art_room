package com.nicole.ssm.aspectj;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Aspect
@Component
public class ArtAspect {
    private final static Logger logger = Logger.getLogger(ArtAspect.class);
//    private final static Logger logger = LoggerFactory.getLogger(ArtAspect.class);

    /**
     * 定义切入点所有service,完成service计时要求
     */
    @Pointcut("execution(* com.nicole.ssm.service.*Service.*(..))")
    private void logRecordServiceTime(){};

    /**
     * 定义切入点，记录入参，返回值。选择记录controller,如果还要记录service
     *"execution(* com.nicole.ssm.controller.*Controller.*(..))  ||
     *  execution(* com.nicole.ssm.service.*Service.*(..))"
     */
    @Pointcut("execution(* com.nicole.ssm.controller.*Controller.*(..))")
    private void logRecordArgs(){};

    /**
     * around所有service,完成service计时要求
     */
    @Around("logRecordServiceTime()")
    public Object around(ProceedingJoinPoint joinPoint)  {
        String fullMethodName = joinPoint.getSignature().toString();

        logger.info("Method Name : [" + fullMethodName + "] ---> AOP around Service Time start");
        long startTimeMillis = System.currentTimeMillis();
        // proceed() 执行符合pointcut定义的方法
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error("error : "+throwable.getMessage());
        }
        long execTimeMillis = System.currentTimeMillis() - startTimeMillis;
        logger.info("method name : [" + fullMethodName + "] ---> uses time : " + execTimeMillis+"ms");
        return result;
    }

    /**
     * 定义切入点，记录入参，返回值。选择记录controller入参和返回值
     */
    @Around("logRecordArgs()")
    private Object getControllerLog(ProceedingJoinPoint jPoint) {
        //return val, package name, class name, method name
        String fullMethodName = jPoint.getSignature().toString();
        StringBuilder sb = new StringBuilder();

        // 下面两个数组中，参数值和参数名的个数和位置是一一对应的。
        // 参数值
        Object[] argsVal = jPoint.getArgs();
        // 参数名
        String[] paramsName =  ((MethodSignature) jPoint.getSignature()).getParameterNames();

        sb.append( fullMethodName ).append(  " parameter(s) are : { ");
        if( argsVal != null && paramsName != null && argsVal.length > 0 && paramsName.length > 0 ) {
            for (int i = 0 ; i < paramsName.length ; i++ ) {
                sb.append(" ").append( paramsName[i] ).append(" = ")
                        .append(argsVal[i]).append(",");
            }
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append(" } ");

        Object result = null;
        try {
            result = jPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            logger.error("error message : "+throwable.getMessage());
        }
        sb.append(" return (result） :{ ").append(result).append(" } ");
        // 记录日志
        logger.info(sb.toString());
        // 调用结果返回
        return result;

    }
}
