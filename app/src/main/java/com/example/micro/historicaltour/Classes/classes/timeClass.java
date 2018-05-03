package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

public class timeClass implements Parcelable {
    int StartTime;
    int EndTime;

    public timeClass() {
    }

    public timeClass(int startTime, int endTime) {
        StartTime = startTime;
        EndTime = endTime;
    }

    protected timeClass(Parcel in) {
        StartTime = in.readInt();
        EndTime = in.readInt();
    }

    public static final Creator<timeClass> CREATOR = new Creator<timeClass>() {
        @Override
        public timeClass createFromParcel(Parcel in) {
            return new timeClass(in);
        }

        @Override
        public timeClass[] newArray(int size) {
            return new timeClass[size];
        }
    };

    public int getStartTime() {
        return StartTime;
    }

    public void setStartTime(int startTime) {
        StartTime = startTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void setEndTime(int endTime) {
        EndTime = endTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(StartTime);
        dest.writeInt(EndTime);
    }
}
