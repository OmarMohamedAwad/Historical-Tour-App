package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by UNKNOWN on 4/7/2018.
 */

public class tourguideClass implements Parcelable {

    int ID;
    String Name;
    String UserName;
    String Password;
    String Email;
    Date Birthdate;
    String Address;
    int Gender;
    int Experience;
    double Rate;
    String University;
    String Phone;
    byte[] Image;
    String VideosKey;
    ArrayList<String> Languages;
    ArrayList<reviewClass> reviewClasses;

    public tourguideClass() {
    }

    public tourguideClass(int ID, String name, String userName, String password, String email, Date birthdate, String address, int gender, int experience, double rate, String university, String phone, byte[] image, String videosKey, ArrayList<String> languages, ArrayList<reviewClass> reviewClasses) {
        this.ID = ID;
        Name = name;
        UserName = userName;
        Password = password;
        Email = email;
        Birthdate = birthdate;
        Address = address;
        Gender = gender;
        Experience = experience;
        Rate = rate;
        University = university;
        Phone = phone;
        Image = image;
        VideosKey = videosKey;
        Languages = languages;
        this.reviewClasses = reviewClasses;
    }

    public tourguideClass(int ID, String name, String userName, String password, String email, Date birthdate, String address, int gender, int experience, double rate, String university, String phone, ArrayList<String> languages) {
        this.ID = ID;
        Name = name;
        UserName = userName;
        Password = password;
        Email = email;
        Birthdate = birthdate;
        Address = address;
        Gender = gender;
        Experience = experience;
        Rate = rate;
        University = university;
        Phone = phone;
        Languages = languages;
    }

    protected tourguideClass(Parcel in) {
        ID = in.readInt();
        Name = in.readString();
        UserName = in.readString();
        Password = in.readString();
        Email = in.readString();
        Address = in.readString();
        Gender = in.readInt();
        Experience = in.readInt();
        Rate = in.readDouble();
        University = in.readString();
        Phone = in.readString();
        Image = in.createByteArray();
        VideosKey = in.readString();
        Languages = in.createStringArrayList();
        reviewClasses = in.createTypedArrayList(reviewClass.CREATOR);
    }

    public static final Creator<tourguideClass> CREATOR = new Creator<tourguideClass>() {
        @Override
        public tourguideClass createFromParcel(Parcel in) {
            return new tourguideClass(in);
        }

        @Override
        public tourguideClass[] newArray(int size) {
            return new tourguideClass[size];
        }
    };

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    public String getVideosKey() {
        return VideosKey;
    }

    public void setVideosKey(String videosKey) {
        VideosKey = videosKey;
    }

    public ArrayList<String> getLanguages() {
        return Languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        Languages = languages;
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
        dest.writeInt(ID);
        dest.writeString(Name);
        dest.writeString(UserName);
        dest.writeString(Password);
        dest.writeString(Email);
        dest.writeString(Address);
        dest.writeInt(Gender);
        dest.writeInt(Experience);
        dest.writeDouble(Rate);
        dest.writeString(University);
        dest.writeString(Phone);
        dest.writeByteArray(Image);
        dest.writeString(VideosKey);
        dest.writeStringList(Languages);
        dest.writeTypedList(reviewClasses);
    }
}
