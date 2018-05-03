package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by UNKNOWN on 4/7/2018.
 */

public class reviewClass implements Parcelable {

    UserClass userClass;
    float rating;
    String ReviewComment;
    Date date;


    public reviewClass() {
    }

    public reviewClass(UserClass userClass, float rating, String reviewComment, Date date) {
        this.userClass = userClass;
        this.rating = rating;
        ReviewComment = reviewComment;
        this.date = date;
    }

    public reviewClass(UserClass userClass, String reviewComment, Date date) {
        this.userClass = userClass;
        ReviewComment = reviewComment;
        this.date = date;
    }


    protected reviewClass(Parcel in) {
        userClass = in.readParcelable(UserClass.class.getClassLoader());
        rating = in.readFloat();
        ReviewComment = in.readString();
        date= (Date) in.readSerializable();
    }

    public static final Creator<reviewClass> CREATOR = new Creator<reviewClass>() {
        @Override
        public reviewClass createFromParcel(Parcel in) {
            return new reviewClass(in);
        }

        @Override
        public reviewClass[] newArray(int size) {
            return new reviewClass[size];
        }
    };

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public UserClass getUserClass() {
        return userClass;
    }

    public void setUserClass(UserClass userClass) {
        this.userClass = userClass;
    }

    public String getReviewComment() {
        return ReviewComment;
    }

    public void setReviewComment(String reviewComment) {
        ReviewComment = reviewComment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(userClass, flags);
        dest.writeFloat(rating);
        dest.writeString(ReviewComment);
        dest.writeSerializable(date);
    }
}
