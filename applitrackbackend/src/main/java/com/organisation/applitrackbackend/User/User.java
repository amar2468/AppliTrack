package com.organisation.applitrackbackend.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    @NotBlank(message = "Username is required")
    private String username;

    @Column(name = "email", nullable = false)
    @NotBlank(message = "Email is required")
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "registration_date")
    private Date registration_date;

    @Column(name = "last_login_date")
    private Date last_login_date;

    @Column(name = "profile_picture")
    private String profile_picture;

    public User() {
    }

    public User(Long id, String username, String email, String password, Date registration_date, Date last_login_date, String profile_picture) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.registration_date = registration_date;
        this.last_login_date = last_login_date;
        this.profile_picture = profile_picture;
    }

    public User(String username, String email, String password, Date registration_date, Date last_login_date, String profile_picture) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.registration_date = registration_date;
        this.last_login_date = last_login_date;
        this.profile_picture = profile_picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }
}
