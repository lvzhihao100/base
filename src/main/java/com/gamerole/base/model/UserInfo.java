package com.gamerole.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
@ApiModel(description = "用户数据")
public class UserInfo {

    /**
     * 主键
     */
    @ApiModelProperty(value = "用户id")
    @Id
    private String id;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    @Column(name = "user_name")
    private String userName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
