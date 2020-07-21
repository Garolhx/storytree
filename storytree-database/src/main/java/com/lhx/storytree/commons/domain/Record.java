package com.lhx.storytree.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "record")
public class Record {
    /**
     * ID自增
     */
    @Id
    @Column(name = "record_id")
    private Long recordId;

    @Column(name = "record_ip")
    private String recordIp;

    @Column(name = "record_time")
    private Date recordTime;

    @Column(name = "record_browser")
    private String recordBrowser;

    /**
     * 等同user_id
     */
    @Column(name = "record_user_id")
    private Long recordUserId;

    @Column(name = "record_tag")
    private String recordTag;

    /**
     * 获取ID自增
     *
     * @return record_id - ID自增
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 设置ID自增
     *
     * @param recordId ID自增
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * @return record_ip
     */
    public String getRecordIp() {
        return recordIp;
    }

    /**
     * @param recordIp
     */
    public void setRecordIp(String recordIp) {
        this.recordIp = recordIp;
    }

    /**
     * @return record_time
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * @param recordTime
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * @return record_browser
     */
    public String getRecordBrowser() {
        return recordBrowser;
    }

    /**
     * @param recordBrowser
     */
    public void setRecordBrowser(String recordBrowser) {
        this.recordBrowser = recordBrowser;
    }

    /**
     * 获取等同user_id
     *
     * @return record_user_id - 等同user_id
     */
    public Long getRecordUserId() {
        return recordUserId;
    }

    /**
     * 设置等同user_id
     *
     * @param recordUserId 等同user_id
     */
    public void setRecordUserId(Long recordUserId) {
        this.recordUserId = recordUserId;
    }

    /**
     * @return record_tag
     */
    public String getRecordTag() {
        return recordTag;
    }

    /**
     * @param recordTag
     */
    public void setRecordTag(String recordTag) {
        this.recordTag = recordTag;
    }
}