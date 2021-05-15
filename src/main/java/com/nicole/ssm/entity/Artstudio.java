package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (Artstudio)实体类
 *
 * @author makejava
 * @since 2021-05-11 15:39:59
 */
public class Artstudio implements Serializable {
    private static final long serialVersionUID = 908010334320463459L;
    
    private Long id;
    
    private Long createdAt;
    
    private Long updatedAt;
    
    private Long editorId;
    
    private String name;
    /**
    * show1;noshow0
    */
    private Integer status;
    
    private String imageUrl;
    
    private String content;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}