package com.example.ycjf1.bean;

public class User extends BmobUser {
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
}

