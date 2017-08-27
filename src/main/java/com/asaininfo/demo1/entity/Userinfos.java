package com.asaininfo.demo1.entity;



import java.util.Date;

/**
 * Created by 程然 on 2017/8/22.
 */
public class Userinfos {

    private int userid;
    private String username;
    private Date birthday;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
