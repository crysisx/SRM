package com.sxt.blogs.pojo;

import java.util.Date;

public class Blogs {
    private Integer blogsId;

    private String blogsUrl;

    private Integer blogsTypeId;

    private Date createTime;

    private Integer stuId;

    private String blogsName;

    public Integer getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(Integer blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsUrl() {
        return blogsUrl;
    }

    public void setBlogsUrl(String blogsUrl) {
        this.blogsUrl = blogsUrl == null ? null : blogsUrl.trim();
    }

    public Integer getBlogsTypeId() {
        return blogsTypeId;
    }

    public void setBlogsTypeId(Integer blogsTypeId) {
        this.blogsTypeId = blogsTypeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getBlogsName() {
        return blogsName;
    }

    public void setBlogsName(String blogsName) {
        this.blogsName = blogsName == null ? null : blogsName.trim();
    }
}