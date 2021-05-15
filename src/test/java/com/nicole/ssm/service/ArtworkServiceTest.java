package com.nicole.ssm.service;

import com.nicole.ssm.entity.Artstudio;
import com.nicole.ssm.entity.Artwork;
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
public class ArtworkServiceTest {

    @Autowired
    private ArtworkService artworkService;

    @Test
    @Transactional
    @Rollback(true)
    public void testQueryArtworksNewUpdate(){
        List<Artwork> artworks = artworkService.queryArtworksNewUpdate();
        for (Artwork artwork : artworks) {
            System.out.println( artwork.getUpdatedAt());
        }
    }
}
