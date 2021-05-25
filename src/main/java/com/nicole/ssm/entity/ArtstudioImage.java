package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (ArtstudioImage)实体类
 *
 * @author makejava
 * @since 2021-05-17 17:21:17
 */
public class ArtstudioImage implements Serializable {
    private static final long serialVersionUID = -12490891883418678L;
    
    private Long id;
    
    private Long createdAt;
    
    private Long updatedAt;
    
    private Long editorId;
    /**
    * show1;noshow0
    */
    private Integer status;
    
    private String imageUrl;
    
    private Long artstudioId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getEditorId() {
        return editorId;
    }

    public void setEditorId(Long editorId) {
        this.editorId = editorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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