package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (CommentReply)实体类
 *
 * @author makejava
 * @since 2021-05-17 17:21:19
 */
public class CommentReply implements Serializable {
    private static final long serialVersionUID = -75754340982022761L;
    
    private Long id;
    
    private Long createdAt;
    
    private Long updatedAt;
    
    private Long editorId;
    
    private Long artworkId;
    /**
    * comment shows1;noshow0;administrators' reply2
    */
    private Integer status;
    
    private Long parentId;
    
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

    public Long getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(Long artworkId) {
        this.artworkId = artworkId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}