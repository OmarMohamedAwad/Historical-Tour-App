package com.example.micro.historicaltour;

import com.example.micro.historicaltour.hotels.hotel;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by micro on 18/04/2018.
 */

public class user {
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

    ArrayList<Places> SelectedPlaces ;
    ArrayList<hotel> SelectedHotels ;

    public user() {
    }

    public user(int ID, String name, String userName, String password, String email, Date birthdate, String address, int gender, String phone, byte[] image) {
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

    public ArrayList<Places> getSelectedPlaces() {
        return SelectedPlaces;
    }

    public void setSelectedPlaces(ArrayList<Places> selectedPlaces) {
        SelectedPlaces = selectedPlaces;
    }

    public ArrayList<hotel> getSelectedHotels() {
        return SelectedHotels;
    }

    public void setSelectedHotels(ArrayList<hotel> selectedHotels) {
        SelectedHotels = selectedHotels;
    }
}
