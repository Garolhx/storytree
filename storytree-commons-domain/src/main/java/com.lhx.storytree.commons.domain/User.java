package com.lhx.storytree.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {
    /**
     * 用户ID自增
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户性别
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 用户电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户邮箱
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 用户密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户标志
     */
    @Column(name = "user_tag")
    private String userTag;

    /**
     * 用户头像URL
     */
    @Column(name = "user_image")
    private String userImage;

    /**
     * 获取用户ID自增
     *
     * @return user_id - 用户ID自增
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID自增
     *
     * @param userId 用户ID自增
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户性别
     *
     * @return user_sex - 用户性别
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置用户性别
     *
     * @param userSex 用户性别
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取用户电话
     *
     * @return user_phone - 用户电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户电话
     *
     * @param userPhone 用户电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户邮箱
     *
     * @return user_email - 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置用户邮箱
     *
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取用户密码
     *
     * @return user_password - 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户密码
     *
     * @param userPassword 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户标志
     *
     * @return user_tag - 用户标志
     */
    public String getUserTag() {
        return userTag;
    }

    /**
     * 设置用户标志
     *
     * @param userTag 用户标志
     */
    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }

    /**
     * 获取用户头像URL
     *
     * @return user_image - 用户头像URL
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * 设置用户头像URL
     *
     * @param userImage 用户头像URL
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }
}