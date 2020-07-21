package com.lhx.storytree.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "continuation")
public class Continuation {
    /**
     * ID自增
     */
    @Id
    @Column(name = "continuation_id")
    private Long continuationId;

    @Column(name = "continuation_content")
    private String continuationContent;

    @Column(name = "continuation_time")
    private Date continuationTime;

    @Column(name = "continuation_paragraph")
    private String continuationParagraph;

    /**
     * 等同story_id
     */
    @Column(name = "continuation_story_id")
    private Long continuationStoryId;

    /**
     * 等同user_id
     */
    @Column(name = "continuation_user_id")
    private Long continuationUserId;

    @Column(name = "continuation_tag")
    private String continuationTag;

    /**
     * 获取ID自增
     *
     * @return continuation_id - ID自增
     */
    public Long getContinuationId() {
        return continuationId;
    }

    /**
     * 设置ID自增
     *
     * @param continuationId ID自增
     */
    public void setContinuationId(Long continuationId) {
        this.continuationId = continuationId;
    }

    /**
     * @return continuation_content
     */
    public String getContinuationContent() {
        return continuationContent;
    }

    /**
     * @param continuationContent
     */
    public void setContinuationContent(String continuationContent) {
        this.continuationContent = continuationContent;
    }

    /**
     * @return continuation_time
     */
    public Date getContinuationTime() {
        return continuationTime;
    }

    /**
     * @param continuationTime
     */
    public void setContinuationTime(Date continuationTime) {
        this.continuationTime = continuationTime;
    }

    /**
     * @return continuation_paragraph
     */
    public String getContinuationParagraph() {
        return continuationParagraph;
    }

    /**
     * @param continuationParagraph
     */
    public void setContinuationParagraph(String continuationParagraph) {
        this.continuationParagraph = continuationParagraph;
    }

    /**
     * 获取等同story_id
     *
     * @return continuation_story_id - 等同story_id
     */
    public Long getContinuationStoryId() {
        return continuationStoryId;
    }

    /**
     * 设置等同story_id
     *
     * @param continuationStoryId 等同story_id
     */
    public void setContinuationStoryId(Long continuationStoryId) {
        this.continuationStoryId = continuationStoryId;
    }

    /**
     * 获取等同user_id
     *
     * @return continuation_user_id - 等同user_id
     */
    public Long getContinuationUserId() {
        return continuationUserId;
    }

    /**
     * 设置等同user_id
     *
     * @param continuationUserId 等同user_id
     */
    public void setContinuationUserId(Long continuationUserId) {
        this.continuationUserId = continuationUserId;
    }

    /**
     * @return continuation_tag
     */
    public String getContinuationTag() {
        return continuationTag;
    }

    /**
     * @param continuationTag
     */
    public void setContinuationTag(String continuationTag) {
        this.continuationTag = continuationTag;
    }
}