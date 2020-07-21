package com.lhx.storytree.commons.domain;

import javax.persistence.*;

@Table(name = "menu")
public class Menu {
    /**
     * id自增
     */
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "menu_father_id")
    private Integer menuFatherId;

    @Column(name = "menu_tag")
    private String menuTag;

    /**
     * 获取id自增
     *
     * @return menu_id - id自增
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置id自增
     *
     * @param menuId id自增
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return menu_father_id
     */
    public Integer getMenuFatherId() {
        return menuFatherId;
    }

    /**
     * @param menuFatherId
     */
    public void setMenuFatherId(Integer menuFatherId) {
        this.menuFatherId = menuFatherId;
    }

    /**
     * @return menu_tag
     */
    public String getMenuTag() {
        return menuTag;
    }

    /**
     * @param menuTag
     */
    public void setMenuTag(String menuTag) {
        this.menuTag = menuTag;
    }
}