package com.example.micro.historicaltour.hotels;

import com.example.micro.historicaltour.review;

import java.util.ArrayList;

/**
 * Created by micro on 18/04/2018.
 */

public class hotel {

    int Id;
    String Name ;
    double Rate;
    int Exeprience;
    int Stars;
    String VideoKey;
    ArrayList<Integer[]> Images;
    String Descrption;
    double latidue;
    double longtude;
    ArrayList<review> Reviews = new ArrayList<>();


    public hotel() {
    }

    public hotel(int id, String name, double rate, int exeprience, int stars, String videoKey, ArrayList<Integer[]> images, String descrption, double lng,double lat) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        longtude = lng;
        latidue=lat;
    }
    public hotel(int id, String name, double rate, int exeprience, int stars, String videoKey, String descrption, double lng,double lat) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;

        Descrption = descrption;
        longtude = lng;
        latidue=lat;
    }
    public hotel(int id, String name, double rate, int exeprience, int stars, String videoKey, ArrayList<Integer[]> images, String descrption,double lng,double lat, ArrayList<review> reviews) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        longtude = lng;
        latidue=lat;
        Reviews = reviews;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public int getExeprience() {
        return Exeprience;
    }

    public void setExeprience(int exeprience) {
        Exeprience = exeprience;
    }

    public int getStars() {
        return Stars;
    }

    public void setStars(int stars) {
        Stars = stars;
    }

    public String getVideoKey() {
        return VideoKey;
    }

    public void setVideoKey(String videoKey) {
        VideoKey = videoKey;
    }

    public ArrayList<Integer[]> getImages() {
        return Images;
    }

    public void setImages(ArrayList<Integer[]> images) {
        Images = images;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String descrption) {
        Descrption = descrption;
    }

    public double getLatidue() {
        return latidue;
    }

    public void setLatidue(double latidue) {
        this.latidue = latidue;
    }

    public double getLongtude() {
        return longtude;
    }

    public void setLongtude(double longtude) {
        this.longtude = longtude;
    }

    public ArrayList<review> getReviews() {
        return Reviews;
    }

    public void setReviews(ArrayList<review> reviews) {
        Reviews = reviews;
    }
}
