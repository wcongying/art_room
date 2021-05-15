package com.nicole.ssm.rest;

import java.util.HashMap;
import java.util.Map;

public class Restful {
    public static Map<String, Object> set(int code, String msg, Object o){
        Map<String, Object> restful = new HashMap<>();
        restful.put("code" , code);
        restful.put("msg" , msg);
        restful.put("Object" , o);
        return restful;
    }

    public static Map<String, Object> set(int code, String msg){
        Map<String, Object> restful = new HashMap<>();
        restful.put("code" , code);
        restful.put("msg" , msg);
        return restful;
    }
}
