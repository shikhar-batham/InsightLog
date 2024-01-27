package com.example.insightlog.model;

public class Login {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login(Integer id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    private Integer id;
    private String email;
    private String password;
}
