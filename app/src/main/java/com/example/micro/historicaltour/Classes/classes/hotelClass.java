package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by UNKNOWN on 4/7/2018.
 */

public class hotelClass implements Parcelable{

    int Id;
    String Name ;
    double Rate;
    int Exeprience;
    int Stars;
    String VideoKey;

    public ArrayList<timeClass> getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(ArrayList<timeClass> workingDays) {
        WorkingDays = workingDays;
    }

    ArrayList<byte[]> Images;
    String Descrption;
    String Location;
    double latidue;
    double longtude;
    ArrayList<reviewClass> reviewClasses = new ArrayList<>();
    ArrayList<timeClass> WorkingDays = new ArrayList<>();



    public hotelClass() {
    }

    public hotelClass(int id, String name, double rate, int exeprience, ArrayList<timeClass> workingDays, int stars, String videoKey, ArrayList<byte[]> images, String descrption, String location) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        Location = location;
        WorkingDays = workingDays;

    }

    public hotelClass(int id, String name, double rate, int exeprience, int stars, String videoKey, ArrayList<byte[]> images, String descrption, String location, ArrayList<reviewClass> reviewClasses) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        Location = location;
        this.reviewClasses = reviewClasses;
    }

    public hotelClass(int id, String name, double rate, int exeprience, int stars, String videoKey, ArrayList<byte[]> images, String descrption, String location, double latidue, double longtude, ArrayList<reviewClass> reviewClasses) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        Location = location;
        this.latidue = latidue;
        this.longtude = longtude;
        this.reviewClasses = reviewClasses;
    }

    protected hotelClass(Parcel in) {
        Id = in.readInt();
        Name = in.readString();
        Rate = in.readDouble();
        Exeprience = in.readInt();
        Stars = in.readInt();
        VideoKey = in.readString();
        Descrption = in.readString();
        Location = in.readString();
        latidue = in.readDouble();
        longtude = in.readDouble();
        reviewClasses = in.createTypedArrayList(reviewClass.CREATOR);
    }

    public static final Creator<hotelClass> CREATOR = new Creator<hotelClass>() {
        @Override
        public hotelClass createFromParcel(Parcel in) {
            return new hotelClass(in);
        }

        @Override
        public hotelClass[] newArray(int size) {
            return new hotelClass[size];
        }
    };


    public hotelClass(int id, String name, double rate, int exeprience, int stars, String videoKey, String location, double latidue, double longtude, ArrayList<timeClass> workingDays, ArrayList<reviewClass> reviewClasses, String descrption) {
        Id = id;
        Name = name;
        Rate = rate;
        Exeprience = exeprience;
        Stars = stars;
        VideoKey = videoKey;
        Location = location;
        this.latidue = latidue;
        this.longtude = longtude;
        WorkingDays = workingDays;
        this.reviewClasses = reviewClasses;
        Descrption=descrption;
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

    public ArrayList<byte[]> getImages() {
        return Images;
    }

    public void setImages(ArrayList<byte[]> images) {
        Images = images;
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

    public ArrayList<reviewClass> getReviewClasses() {
        return reviewClasses;
    }

    public void setReviewClasses(ArrayList<reviewClass> reviewClasses) {
        this.reviewClasses = reviewClasses;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Id);
        dest.writeString(Name);
        dest.writeDouble(Rate);
        dest.writeInt(Exeprience);
        dest.writeInt(Stars);
        dest.writeString(VideoKey);
        dest.writeString(Descrption);
        dest.writeString(Location);
        dest.writeDouble(latidue);
        dest.writeDouble(longtude);
        dest.writeTypedList(reviewClasses);
    }
}
