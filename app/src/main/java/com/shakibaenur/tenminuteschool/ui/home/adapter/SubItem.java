package com.shakibaenur.tenminuteschool.ui.home.adapter;


import android.os.Parcel;
import android.os.Parcelable;

public class SubItem implements Parcelable {
    String title;


    public SubItem(String title) {
        this.title = title;
    }

    protected SubItem(Parcel in) {
        title = in.readString();
    }


    public static final Creator<SubItem> CREATOR = new Creator<SubItem>() {
        @Override
        public SubItem createFromParcel(Parcel in) {
            return new SubItem(in);
        }

        @Override
        public SubItem[] newArray(int size) {
            return new SubItem[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
    }
}
