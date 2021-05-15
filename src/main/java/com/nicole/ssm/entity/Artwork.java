package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (Artwork)实体类
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
public class Artwork implements Serializable {
    private static final long serialVersionUID = -32973845721747057L;
    
    private Long id;
    
    private Long createdAt;
    
    private Long updatedAt;
    
    private Long editorId;
    
    private String name;
    
    private Integer status;
    
    private Long manuOneId;
    
    private Long manuTwoId;
    
    private String introduction;
    
    private String thumbnailImageUrl;
    
    private String videoUrl;
    
    private String imageUrl;
    
    private String article;


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

    public Long getManuOneId() {
        return manuOneId;
    }

    public void setManuOneId(Long manuOneId) {
        this.manuOneId = manuOneId;
    }

    public Long getManuTwoId() {
        return manuTwoId;
    }

    public void setManuTwoId(Long manuTwoId) {
        this.manuTwoId = manuTwoId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

}