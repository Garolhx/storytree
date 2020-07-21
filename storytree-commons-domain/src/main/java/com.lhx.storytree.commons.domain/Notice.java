package com.lhx.storytree.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "notice")
public class Notice {
    /**
     * 公告ID
     */
    @Id
    @Column(name = "notice_id")
    private Long noticeId;

    /**
     * 公告内容
     */
    @Column(name = "notice_content")
    private String noticeContent;

    /**
     * 公告时间
     */
    @Column(name = "notice_time")
    private Date noticeTime;

    /**
     * 公告标志
     */
    @Column(name = "notice_tag")
    private String noticeTag;

    /**
     * 获取公告ID
     *
     * @return notice_id - 公告ID
     */
    public Long getNoticeId() {
        return noticeId;
    }

    /**
     * 设置公告ID
     *
     * @param noticeId 公告ID
     */
    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    /**
     * 获取公告内容
     *
     * @return notice_content - 公告内容
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * 设置公告内容
     *
     * @param noticeContent 公告内容
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    /**
     * 获取公告时间
     *
     * @return notice_time - 公告时间
     */
    public Date getNoticeTime() {
        return noticeTime;
    }

    /**
     * 设置公告时间
     *
     * @param noticeTime 公告时间
     */
    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * 获取公告标志
     *
     * @return notice_tag - 公告标志
     */
    public String getNoticeTag() {
        return noticeTag;
    }

    /**
     * 设置公告标志
     *
     * @param noticeTag 公告标志
     */
    public void setNoticeTag(String noticeTag) {
        this.noticeTag = noticeTag;
    }
}