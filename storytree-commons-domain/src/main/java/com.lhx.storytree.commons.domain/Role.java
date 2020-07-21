package com.lhx.storytree.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "role")
public class Role {
    /**
     * id自增
     */
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_tag")
    private String roleTag;

    /**
     * 获取id自增
     *
     * @return role_id - id自增
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置id自增
     *
     * @param roleId id自增
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_tag
     */
    public String getRoleTag() {
        return roleTag;
    }

    /**
     * @param roleTag
     */
    public void setRoleTag(String roleTag) {
        this.roleTag = roleTag;
    }
}