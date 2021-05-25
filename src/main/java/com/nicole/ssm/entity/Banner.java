package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (Banner)实体类
 *
 * @author makejava
 * @since 2021-05-17 17:21:19
 */
public class Banner implements Serializable {
    private static final long serialVersionUID = 668702215745218379L;
    
    private Long id;
    
    private Long createdAt;
    
    private Long updatedAt;
    
    private Long editorId;
    
    private String coverUrl;
    /**
    * show1;noshow0
    */
    private Integer status;
    
    private String artworkUrl;


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

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getArtworkUrl() {
        return artworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        this.artworkUrl = artworkUrl;
    }

}