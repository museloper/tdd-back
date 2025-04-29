package com.example.user;

public class UserVO {
    
    private Integer userSeq;
    private String username;
    private String password;

    public UserVO(Integer userSeq, String username, String password) {
        this.userSeq = userSeq;
        this.username = username;
        this.password = password;
    }

    public Integer getUserSeq() { return userSeq; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
