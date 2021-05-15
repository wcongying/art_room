package com.nicole.ssm.entity;

import java.io.Serializable;

/**
 * (Manu)实体类
 *
 * @author makejava
 * @since 2021-05-11 15:40:08
 */
public class Manu implements Serializable {
    private static final long serialVersionUID = -58682787781781188L;
    
    private Long id;
    
    private Long createdAt;
    
    private Long updatedAt;
    
    private Long editorId;
    
    private String name;
    /**
    * show1;noshow0
    */
    private Integer status;
    /**
    * root0;manu on level1;manu on level2;can be expanded
    */
    private Integer level;
    /**
    * root0 is the root of manu on level1; 1 is 2's father
    */
    private Long parentId;
    /**
    * manu only, no artwork
    */
    private String childrenIds;


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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getChildrenIds() {
        return childrenIds;
    }

    public void setChildrenIds(String childrenIds) {
        this.childrenIds = childrenIds;
    }

}