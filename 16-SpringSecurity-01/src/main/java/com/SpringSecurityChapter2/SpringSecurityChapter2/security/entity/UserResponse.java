package com.SpringSecurityChapter2.SpringSecurityChapter2.security.entity;

public class UserResponse {

    private Long id;
    private String username;
    private String authority;

    public UserResponse(Long id, String username, String authority) {
        this.id = id;
        this.username = username;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
