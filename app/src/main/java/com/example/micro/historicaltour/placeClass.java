package com.example.micro.historicaltour;

/**
 * Created by UNKNOWN on 3/21/2018.
 */

public class placeClass {

    int Id;
    String Name ;
    double Rate;
    int VideoId;
    int ImageId;
    String Descrption;
    String Location;


    public placeClass(){

    }

    public placeClass(int id, String name,double rate , int imageId, String descrption, String location) {
        setId(id);
        setName(name);
        setImageId(imageId);
        setDescrption(descrption);
        setLocation(location);
        setRate(rate);
    }

    public placeClass(int id, String name,double rate ,int videoId, int imageId, String descrption, String location) {
        setId(id);
        setName(name);
        setVideoId(videoId);
        setImageId(imageId);
        setDescrption(descrption);
        setLocation(location);
        setRate(rate);
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        this.Rate = rate;
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

    public int getVideoId() {
        return VideoId;
    }

    public void setVideoId(int videoId) {
        VideoId = videoId;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String descrption) {
        Descrption = descrption;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
