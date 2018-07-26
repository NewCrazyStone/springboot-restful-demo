package com.my.springbootjersey.model;

import javax.ws.rs.FormParam;
import java.io.Serializable;

/**
 * TODO User
 *
 * @author ChenWei
 * @date 2018/7/13 14:06
 */

public class User implements Serializable {
    @FormParam("userId")
    private Integer userId;
    @FormParam("userName")
    private String userName;
    @FormParam("password")
    private String password;
    @FormParam("phone")
    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}