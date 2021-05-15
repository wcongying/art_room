package com.nicole.ssm.service;

import com.nicole.ssm.entity.Artstudio;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ArtstudioServiceTest {

    @Autowired
    private ArtstudioService artstudioService;

    @Test
    @Transactional
    @Rollback(true)
    public void testQueryLimit(){
        List<Artstudio> artstudios = artstudioService.queryLimitArtstudios();
        for (Artstudio artstudio : artstudios) {
            System.out.println( artstudio.getCreatedAt());
        }
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testQueryById(){
        long id = 1;
        Artstudio artstudio = artstudioService.queryById(id);
        Assert.assertEquals( "water lily", artstudio.getName());
    }
}
