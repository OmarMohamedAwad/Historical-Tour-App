package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by UNKNOWN on 4/7/2018.
 */

public class tourClass implements Parcelable {


    tourguideClass selectedTourGuide;

    HashMap<Date,ArrayList<placeClass>> PlacesSchedule;
    HashMap<Date,ArrayList<placeClass>> HotelsSchedule;


    public tourClass() {
    }


    public tourClass(tourguideClass selectedTourGuide, HashMap<Date, ArrayList<placeClass>> placesSchedule, HashMap<Date, ArrayList<placeClass>> hotelsSchedule) {
        this.selectedTourGuide = selectedTourGuide;
        PlacesSchedule = placesSchedule;
        HotelsSchedule = hotelsSchedule;
    }

    protected tourClass(Parcel in) {
    }

    public static final Creator<tourClass> CREATOR = new Creator<tourClass>() {
        @Override
        public tourClass createFromParcel(Parcel in) {
            return new tourClass(in);
        }

        @Override
        public tourClass[] newArray(int size) {
            return new tourClass[size];
        }
    };

    public tourguideClass getSelectedTourGuide() {
        return selectedTourGuide;
    }

    public void setSelectedTourGuide(tourguideClass selectedTourGuide) {
        this.selectedTourGuide = selectedTourGuide;
    }

    public HashMap<Date, ArrayList<placeClass>> getPlacesSchedule() {
        return PlacesSchedule;
    }

    public void setPlacesSchedule(HashMap<Date, ArrayList<placeClass>> placesSchedule) {
        PlacesSchedule = placesSchedule;
    }

    public HashMap<Date, ArrayList<placeClass>> getHotelsSchedule() {
        return HotelsSchedule;
    }

    public void setHotelsSchedule(HashMap<Date, ArrayList<placeClass>> hotelsSchedule) {
        HotelsSchedule = hotelsSchedule;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
