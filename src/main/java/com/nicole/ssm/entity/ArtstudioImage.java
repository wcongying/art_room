package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (ArtstudioImage)实体类
 *
 * @author makejava
 * @since 2021-05-15 20:30:58
 */
public class ArtstudioImage implements Serializable {
    private static final long serialVersionUID = 234742343861831722L;
    
    private Long id;
    
    private String imageUrl;
    
    private Long artstudioId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getArtstudioId() {
        return artstudioId;
    }

    public void setArtstudioId(Long artstudioId) {
        this.artstudioId = artstudioId;
    }

}