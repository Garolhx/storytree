package com.lhx.storytree.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "comment")
public class Comment {
    /**
     * 评论ID
     */
    @Id
    @Column(name = "comment_id")
    private Long commentId;

    /**
     * 评论所属文章
     */
    @Column(name = "comment_story_id")
    private Long commentStoryId;

    /**
     * 评论内容
     */
    @Column(name = "comment_content")
    private String commentContent;

    /**
     * 评论作者
     */
    @Column(name = "comment_author")
    private Long commentAuthor;

    /**
     * 评论时间
     */
    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * 评论标志
     */
    @Column(name = "comment_tag")
    private String commentTag;

    /**
     * 获取评论ID
     *
     * @return comment_id - 评论ID
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 设置评论ID
     *
     * @param commentId 评论ID
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取评论所属文章
     *
     * @return comment_story_id - 评论所属文章
     */
    public Long getCommentStoryId() {
        return commentStoryId;
    }

    /**
     * 设置评论所属文章
     *
     * @param commentStoryId 评论所属文章
     */
    public void setCommentStoryId(Long commentStoryId) {
        this.commentStoryId = commentStoryId;
    }

    /**
     * 获取评论内容
     *
     * @return comment_content - 评论内容
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * 设置评论内容
     *
     * @param commentContent 评论内容
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    /**
     * 获取评论作者
     *
     * @return comment_author - 评论作者
     */
    public Long getCommentAuthor() {
        return commentAuthor;
    }

    /**
     * 设置评论作者
     *
     * @param commentAuthor 评论作者
     */
    public void setCommentAuthor(Long commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    /**
     * 获取评论时间
     *
     * @return comment_time - 评论时间
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置评论时间
     *
     * @param commentTime 评论时间
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 获取评论标志
     *
     * @return comment_tag - 评论标志
     */
    public String getCommentTag() {
        return commentTag;
    }

    /**
     * 设置评论标志
     *
     * @param commentTag 评论标志
     */
    public void setCommentTag(String commentTag) {
        this.commentTag = commentTag;
    }
}