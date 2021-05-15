package com.nicole.ssm.service;

import com.nicole.ssm.entity.Manu;
import com.nicole.ssm.vo.ManuVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ManuServiceTest {

    @Autowired
    private ManuService manuService;

    @Test
    @Transactional
    @Rollback(true)
    public void testQueryAllChildrenManus() {
        List<Manu> result = manuService.queryAllChildrenManus(0L);
        for (Manu manu : result) {
            System.out.println(manu);
            System.out.println(manu.getName());
        }
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testQueryAllChildrenManuVos() {
        ManuVo manuVo = manuService.queryAllChildrenManuVos(0L);
        for (ManuVo child : manuVo.getChildren()) {
            System.out.println(child.getName());
        }
    }
}
