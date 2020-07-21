package com.lhx.storytree.commons.domain;

import javax.persistence.*;

@Table(name = "permission")
public class Permission {
    /**
     * id自增
     */
    @Id
    @Column(name = "permission_id")
    private Integer permissionId;

    /**
     * 等同role_id
     */
    @Column(name = "permission_role_id")
    private Integer permissionRoleId;

    /**
     * 等同menu_id
     */
    @Column(name = "permission_menu_id")
    private Integer permissionMenuId;

    @Column(name = "permission_status")
    private String permissionStatus;

    /**
     * 获取id自增
     *
     * @return permission_id - id自增
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 设置id自增
     *
     * @param permissionId id自增
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取等同role_id
     *
     * @return permission_role_id - 等同role_id
     */
    public Integer getPermissionRoleId() {
        return permissionRoleId;
    }

    /**
     * 设置等同role_id
     *
     * @param permissionRoleId 等同role_id
     */
    public void setPermissionRoleId(Integer permissionRoleId) {
        this.permissionRoleId = permissionRoleId;
    }

    /**
     * 获取等同menu_id
     *
     * @return permission_menu_id - 等同menu_id
     */
    public Integer getPermissionMenuId() {
        return permissionMenuId;
    }

    /**
     * 设置等同menu_id
     *
     * @param permissionMenuId 等同menu_id
     */
    public void setPermissionMenuId(Integer permissionMenuId) {
        this.permissionMenuId = permissionMenuId;
    }

    /**
     * @return permission_status
     */
    public String getPermissionStatus() {
        return permissionStatus;
    }

    /**
     * @param permissionStatus
     */
    public void setPermissionStatus(String permissionStatus) {
        this.permissionStatus = permissionStatus;
    }
}