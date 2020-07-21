package com.lhx.storytree.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "chapter")
public class Chapter {
    /**
     * 章节ID
     */
    @Id
    @Column(name = "chapter_id")
    private Long chapterId;

    /**
     * 章节内容
     */
    @Column(name = "chapter_content")
    private String chapterContent;

    /**
     * 章节完成时间
     */
    @Column(name = "chapter_time")
    private Date chapterTime;

    /**
     * 章节题目
     */
    @Column(name = "chapter_name")
    private String chapterName;

    /**
     * 章节故事ID
     */
    @Column(name = "chapter_story_id")
    private Long chapterStoryId;

    /**
     * 章节作者
     */
    @Column(name = "chapter_author")
    private Long chapterAuthor;

    /**
     * 章节标志
     */
    @Column(name = "chapter_tag")
    private String chapterTag;

    /**
     * 章节节数
     */
    @Column(name = "chapter_number")
    private Long chapterNumber;

    /**
     * 获取章节ID
     *
     * @return chapter_id - 章节ID
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * 设置章节ID
     *
     * @param chapterId 章节ID
     */
    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 获取章节内容
     *
     * @return chapter_content - 章节内容
     */
    public String getChapterContent() {
        return chapterContent;
    }

    /**
     * 设置章节内容
     *
     * @param chapterContent 章节内容
     */
    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent;
    }

    /**
     * 获取章节完成时间
     *
     * @return chapter_time - 章节完成时间
     */
    public Date getChapterTime() {
        return chapterTime;
    }

    /**
     * 设置章节完成时间
     *
     * @param chapterTime 章节完成时间
     */
    public void setChapterTime(Date chapterTime) {
        this.chapterTime = chapterTime;
    }

    /**
     * 获取章节题目
     *
     * @return chapter_name - 章节题目
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * 设置章节题目
     *
     * @param chapterName 章节题目
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    /**
     * 获取章节故事ID
     *
     * @return chapter_story_id - 章节故事ID
     */
    public Long getChapterStoryId() {
        return chapterStoryId;
    }

    /**
     * 设置章节故事ID
     *
     * @param chapterStoryId 章节故事ID
     */
    public void setChapterStoryId(Long chapterStoryId) {
        this.chapterStoryId = chapterStoryId;
    }

    /**
     * 获取章节作者
     *
     * @return chapter_author - 章节作者
     */
    public Long getChapterAuthor() {
        return chapterAuthor;
    }

    /**
     * 设置章节作者
     *
     * @param chapterAuthor 章节作者
     */
    public void setChapterAuthor(Long chapterAuthor) {
        this.chapterAuthor = chapterAuthor;
    }

    /**
     * 获取章节标志
     *
     * @return chapter_tag - 章节标志
     */
    public String getChapterTag() {
        return chapterTag;
    }

    /**
     * 设置章节标志
     *
     * @param chapterTag 章节标志
     */
    public void setChapterTag(String chapterTag) {
        this.chapterTag = chapterTag;
    }

    /**
     * 获取章节节数
     *
     * @return chapter_number - 章节节数
     */
    public Long getChapterNumber() {
        return chapterNumber;
    }

    /**
     * 设置章节节数
     *
     * @param chapterNumber 章节节数
     */
    public void setChapterNumber(Long chapterNumber) {
        this.chapterNumber = chapterNumber;
    }
}