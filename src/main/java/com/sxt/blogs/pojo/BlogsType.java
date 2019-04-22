package com.sxt.blogs.pojo;

import java.util.Date;

public class BlogsType {
    private Integer typeId;

    private String blogsTypeName;

    private Date createTime;

    private Integer state;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getBlogsTypeName() {
        return blogsTypeName;
    }

    public void setBlogsTypeName(String blogsTypeName) {
        this.blogsTypeName = blogsTypeName == null ? null : blogsTypeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}