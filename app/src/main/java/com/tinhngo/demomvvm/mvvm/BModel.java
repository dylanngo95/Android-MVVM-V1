package com.tinhngo.demomvvm.mvvm;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tinhngo on 3/14/18.
 */

public class BModel implements Parcelable {


    protected BModel(Parcel in) {
    }

    public static final Creator<BModel> CREATOR = new Creator<BModel>() {
        @Override
        public BModel createFromParcel(Parcel in) {
            return new BModel(in);
        }

        @Override
        public BModel[] newArray(int size) {
            return new BModel[size];
        }
    };

    public BModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
