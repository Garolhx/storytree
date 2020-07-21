package com.lhx.storytree.commons.domain.PageUtils;

public class PageUtils {
    private String criteria;
    private int pageNum;
    private Long storyId;
    private Long storyAuthor;

    public Long getStoryAuthor() {
        return storyAuthor;
    }

    public void setStoryAuthor(Long storyAuthor) {
        this.storyAuthor = storyAuthor;
    }



    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }



    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private int pageSize;

}
