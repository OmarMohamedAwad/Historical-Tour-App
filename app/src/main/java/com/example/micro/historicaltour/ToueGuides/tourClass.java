package com.example.micro.historicaltour.ToueGuides;

import java.util.ArrayList;

/**
 * Created by Omar Awad on 3/28/2018.
 */

public class tourClass {

    int id;
    String password;
    String email;
    String userName;
    int gender;
    String name ;
    double rate;
    int videoId;
    int imageId;
    ArrayList<String> language;
    String address;
    String experience;
    String Graduation_certificate;

    public tourClass() {
    }

    public tourClass(int id, String name, double rate,String email, int imageId, String address) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.imageId = imageId;
        this.address = address;
        this.email=email;
    }

    public tourClass(int id, String password, String email, String userName, int gender, String name, double rate, int videoId, int imageId, ArrayList<String> language, String address, String experience, String graduation_certificate) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.userName = userName;
        this.gender = gender;
        this.name = name;
        this.rate = rate;
        this.videoId = videoId;
        this.imageId = imageId;
        this.language = language;
        this.address = address;
        this.experience = experience;
        Graduation_certificate = graduation_certificate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public ArrayList<String> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
