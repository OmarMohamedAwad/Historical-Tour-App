package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by UNKNOWN on 4/7/2018.
 */

public class UserClass implements Parcelable{
    int ID;
    String Name;
    String UserName;
    String Password;
    String Email;
    Date Birthdate;
    String Address;
    int Gender;
    String Phone;
    byte[] Image;

    ArrayList<placeClass> selectedPlaceClasses;
    ArrayList<hotelClass> selectedHotelClasses;

    public UserClass() {
    }

    public UserClass(int ID, String name, String userName, String password, String email, Date birthdate, String address, int gender, String phone, byte[] image) {
        this.ID = ID;
        Name = name;
        UserName = userName;
        Password = password;
        Email = email;
        Birthdate = birthdate;
        Address = address;
        Gender = gender;
        Phone = phone;
        Image = image;
    }

    protected UserClass(Parcel in) {
        ID = in.readInt();
        Name = in.readString();
        UserName = in.readString();
        Password = in.readString();
        Email = in.readString();
        Address = in.readString();
        Gender = in.readInt();
        Phone = in.readString();
        Image = in.createByteArray();
        selectedPlaceClasses = in.createTypedArrayList(placeClass.CREATOR);
        selectedHotelClasses = in.createTypedArrayList(hotelClass.CREATOR);
    }

    public static final Creator<UserClass> CREATOR = new Creator<UserClass>() {
        @Override
        public UserClass createFromParcel(Parcel in) {
            return new UserClass(in);
        }

        @Override
        public UserClass[] newArray(int size) {
            return new UserClass[size];
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

    public ArrayList<placeClass> getSelectedPlaceClasses() {
        return selectedPlaceClasses;
    }

    public void setSelectedPlaceClasses(ArrayList<placeClass> selectedPlaceClasses) {
        this.selectedPlaceClasses = selectedPlaceClasses;
    }

    public ArrayList<hotelClass> getSelectedHotelClasses() {
        return selectedHotelClasses;
    }

    public void setSelectedHotelClasses(ArrayList<hotelClass> selectedHotelClasses) {
        this.selectedHotelClasses = selectedHotelClasses;
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
        dest.writeString(Phone);
        dest.writeByteArray(Image);
        dest.writeTypedList(selectedPlaceClasses);
        dest.writeTypedList(selectedHotelClasses);
    }
}
