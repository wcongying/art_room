package com.nicole.ssm.vo;

import com.nicole.ssm.entity.Manu;

import java.io.Serializable;
import java.util.List;

public class ManuVo implements Serializable {

    private static final long serialVersionUID = -5676054090992413153L;

    private Long id;

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

    public List<ManuVo> getChildren() {
        return children;
    }

    public void setChildren(List<ManuVo> children) {
        this.children = children;
    }

    private Long createdAt;

    private Long updatedAt;

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
    private List<ManuVo> children;

}
