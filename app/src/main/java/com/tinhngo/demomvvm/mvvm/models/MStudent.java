package com.tinhngo.demomvvm.mvvm.models;

import android.os.Parcel;

import com.tinhngo.demomvvm.mvvm.BModel;

/**
 * Created by tinhngo on 3/14/18.
 */

public class MStudent extends BModel {

    public String name;
    public String job;
    public int age;

    private MStudent(Parcel in) {
        this.name = in.readString();
        this.job = in.readString();
        this.age = in.readInt();
    }

    @Override
    public int describeContents() {
        return super.describeContents();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(job);
        parcel.writeInt(age);

    }

    public MStudent(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }


}
