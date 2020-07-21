package com.lhx.storytree.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "story")
public class Story {
    /**
     * 故事ID
     */
    @Id
    @Column(name = "story_id")
    private Long storyId;

    /**
     * 故事标题
     */
    @Column(name = "story_title")
    private String storyTitle;

    /**
     * 故事简介
     */
    @Column(name = "story_introduction")
    private String storyIntroduction;

    /**
     * 故事类型2
     */
    @Column(name = "story_type2")
    private String storyType2;

    /**
     * 故事类型
     */
    @Column(name = "story_type")
    private String storyType;

    /**
     * 故事时间
     */
    @Column(name = "story_time")
    private Date storyTime;

    /**
     * 故事状态
     */
    @Column(name = "story_state")
    private String storyState;

    /**
     * 故事作者
     */
    @Column(name = "story_author")
    private Long storyAuthor;

    /**
     * 故事标志
     */
    @Column(name = "story_tag")
    private String storyTag;

    /**
     * 获取故事ID
     *
     * @return story_id - 故事ID
     */
    public Long getStoryId() {
        return storyId;
    }

    /**
     * 设置故事ID
     *
     * @param storyId 故事ID
     */
    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    /**
     * 获取故事标题
     *
     * @return story_title - 故事标题
     */
    public String getStoryTitle() {
        return storyTitle;
    }

    /**
     * 设置故事标题
     *
     * @param storyTitle 故事标题
     */
    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    /**
     * 获取故事简介
     *
     * @return story_introduction - 故事简介
     */
    public String getStoryIntroduction() {
        return storyIntroduction;
    }

    /**
     * 设置故事简介
     *
     * @param storyIntroduction 故事简介
     */
    public void setStoryIntroduction(String storyIntroduction) {
        this.storyIntroduction = storyIntroduction;
    }

    /**
     * 获取故事类型2
     *
     * @return story_type2 - 故事类型2
     */
    public String getStoryType2() {
        return storyType2;
    }

    /**
     * 设置故事类型2
     *
     * @param storyType2 故事类型2
     */
    public void setStoryType2(String storyType2) {
        this.storyType2 = storyType2;
    }

    /**
     * 获取故事类型
     *
     * @return story_type - 故事类型
     */
    public String getStoryType() {
        return storyType;
    }

    /**
     * 设置故事类型
     *
     * @param storyType 故事类型
     */
    public void setStoryType(String storyType) {
        this.storyType = storyType;
    }

    /**
     * 获取故事时间
     *
     * @return story_time - 故事时间
     */
    public Date getStoryTime() {
        return storyTime;
    }

    /**
     * 设置故事时间
     *
     * @param storyTime 故事时间
     */
    public void setStoryTime(Date storyTime) {
        this.storyTime = storyTime;
    }

    /**
     * 获取故事状态
     *
     * @return story_state - 故事状态
     */
    public String getStoryState() {
        return storyState;
    }

    /**
     * 设置故事状态
     *
     * @param storyState 故事状态
     */
    public void setStoryState(String storyState) {
        this.storyState = storyState;
    }

    /**
     * 获取故事作者
     *
     * @return story_author - 故事作者
     */
    public Long getStoryAuthor() {
        return storyAuthor;
    }

    /**
     * 设置故事作者
     *
     * @param storyAuthor 故事作者
     */
    public void setStoryAuthor(Long storyAuthor) {
        this.storyAuthor = storyAuthor;
    }

    /**
     * 获取故事标志
     *
     * @return story_tag - 故事标志
     */
    public String getStoryTag() {
        return storyTag;
    }

    /**
     * 设置故事标志
     *
     * @param storyTag 故事标志
     */
    public void setStoryTag(String storyTag) {
        this.storyTag = storyTag;
    }
}