package com.mimetroupe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by branden on 3/17/16 at 13:29.
 */
@Entity
public class Mime {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String profileVideoUrl;

    @Column(nullable = false)
    private String interests;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

//    private String influences;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "admimerer")
    @JsonIgnore
    private List<Admimerer> admimerer = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "mime")
    @JsonIgnore
    private List<Admimerer> mime = new ArrayList<>();


    public Mime() {
    }

    public Mime(String userName, String password, String fullName, int age, String imageUrl, String profileVideoUrl, String interests, String city, String state) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.imageUrl = imageUrl;
        this.profileVideoUrl = profileVideoUrl;
        this.interests = interests;
        this.city = city;
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProfileVideoUrl() {
        return profileVideoUrl;
    }

    public void setProfileVideoUrl(String profileVideoUrl) {
        this.profileVideoUrl = profileVideoUrl;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public List<Admimerer> getAdmimerer() {
        return admimerer;
    }

    public List<Admimerer> getMime() {
        return mime;
    }
}