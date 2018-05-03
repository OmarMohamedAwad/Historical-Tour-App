package com.example.micro.historicaltour.Classes.classes;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class governorateClass  implements Parcelable{

    int Id;
    String Name ;
    ArrayList<placeClass> placeClasses;
    byte[] Image ;


    public governorateClass() {
    }

    public governorateClass(int id, String name, byte[] image) {
        Id = id;
        Name = name;
        Image = image;
    }

    public governorateClass(int id, String name, ArrayList<placeClass> placeClasses, byte[] image) {
        Id = id;
        Name = name;
        this.placeClasses = placeClasses;
        Image = image;
    }

    protected governorateClass(Parcel in) {
        Id = in.readInt();
        Name = in.readString();
        Image = in.createByteArray();
    }

    public static final Creator<governorateClass> CREATOR = new Creator<governorateClass>() {
        @Override
        public governorateClass createFromParcel(Parcel in) {
            return new governorateClass(in);
        }

        @Override
        public governorateClass[] newArray(int size) {
            return new governorateClass[size];
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

    public ArrayList<placeClass> getPlaceClasses() {
        return placeClasses;
    }

    public void setPlaceClasses(ArrayList<placeClass> placeClasses) {
        this.placeClasses = placeClasses;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Id);
        dest.writeString(Name);
        dest.writeByteArray(Image);
    }
}
