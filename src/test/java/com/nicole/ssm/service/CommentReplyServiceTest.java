package com.nicole.ssm.service;

import com.nicole.ssm.entity.CommentReply;
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
public class CommentReplyServiceTest {

    @Autowired
    private CommentReplyService commentReplyService;

    @Test
    @Transactional
    @Rollback(true)
    public void testqueryShowByArtworkId(){
        int artworkId = 2;
        List<CommentReply> commentReplies = commentReplyService.queryShowByArtworkId(artworkId);
        for (CommentReply commentReply : commentReplies) {
            System.out.println( commentReply.getContent());
        }
    }
}
