package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by UNKNOWN on 3/21/2018.
 */

public class placeClass implements Parcelable{

    int Id;
    String Name ;
    double Rate;
    String VideoKey;
    ArrayList<byte[]> Images;
    String Descrption;
    String Location;
    float longitude;
    float latitude;
    ArrayList<timeClass> WorkingDays = new ArrayList<>();
    ArrayList<reviewClass> reviewClasses = new ArrayList<>();


    public placeClass() {

    }

    public placeClass(int id, String name, double rate, String videoKey, String descrption, String location, float longitude, float latitude, ArrayList<timeClass> WorkingDays, ArrayList<reviewClass> reviewClasses, ArrayList<byte[]> Images) {
        Id = id;
        Name = name;
        Rate = rate;
        VideoKey = videoKey;
        Descrption = descrption;
        Location = location;
        this.longitude = longitude;
        this.latitude = latitude;
        this.WorkingDays=WorkingDays;
        this.reviewClasses=reviewClasses;
        this.Images=Images;
    }


    public placeClass(int id, String name, double rate, String videoKey, String descrption, String location, float longitude, float latitude) {
        Id = id;
        Name = name;
        Rate = rate;
        VideoKey = videoKey;
        Descrption = descrption;
        Location = location;
        this.longitude = longitude;
        this.latitude = latitude;

    }



    public placeClass(int id, String name, double rate, String videoKey, ArrayList<byte[]> images, String descrption, String location) {
        Id = id;
        Name = name;
        Rate = rate;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        Location = location;
    }

    public placeClass(int id, String name, double rate, String videoKey, ArrayList<byte[]> images, String descrption, String location, ArrayList<timeClass> workingDays, ArrayList<reviewClass> reviewClasses) {
        Id = id;
        Name = name;
        Rate = rate;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        Location = location;
        WorkingDays = workingDays;
        this.reviewClasses = reviewClasses;
    }


    public placeClass(int id, String name, double rate, String videoKey, ArrayList<byte[]> images, String descrption, String location, float longitude, float latitude, ArrayList<timeClass> workingDays, ArrayList<reviewClass> reviewClasses) {
        Id = id;
        Name = name;
        Rate = rate;
        VideoKey = videoKey;
        Images = images;
        Descrption = descrption;
        Location = location;
        this.longitude = longitude;
        this.latitude = latitude;
        WorkingDays = workingDays;
        this.reviewClasses = reviewClasses;
    }


    protected placeClass(Parcel in) {
        Id = in.readInt();
        Name = in.readString();
        Rate = in.readDouble();
        VideoKey = in.readString();
        Descrption = in.readString();
        Location = in.readString();
        longitude = in.readFloat();
        latitude = in.readFloat();
        WorkingDays = in.createTypedArrayList(timeClass.CREATOR);
        reviewClasses = in.createTypedArrayList(reviewClass.CREATOR);
    }

    public static final Creator<placeClass> CREATOR = new Creator<placeClass>() {
        @Override
        public placeClass createFromParcel(Parcel in) {
            return new placeClass(in);
        }

        @Override
        public placeClass[] newArray(int size) {
            return new placeClass[size];
        }
    };

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

    public ArrayList<timeClass> getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(ArrayList<timeClass> workingDays) {
        WorkingDays = workingDays;
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
        dest.writeString(VideoKey);
        dest.writeString(Descrption);
        dest.writeString(Location);
        dest.writeFloat(longitude);
        dest.writeFloat(latitude);
        dest.writeTypedList(WorkingDays);
        dest.writeTypedList(reviewClasses);
    }
}
