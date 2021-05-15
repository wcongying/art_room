package com.nicole.ssm.vo;

import java.util.List;

public class CommentReplyVo {
    private static final long serialVersionUID = 2364862933024485577L;

    private Long id;

    private String createdAt;

    private String updatedAt;

    private Long editorId;

    private Long artworkId;
    /**
     * comment shows1;noshow0;administrators' reply2
     */
    private Integer status;

    private Long parentId;

    private String content;

    List<CommentReplyVo> replies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
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

    public List<CommentReplyVo> getReplies() {
        return replies;
    }

    public void setReplies(List<CommentReplyVo> replies) {
        this.replies = replies;
    }
}
