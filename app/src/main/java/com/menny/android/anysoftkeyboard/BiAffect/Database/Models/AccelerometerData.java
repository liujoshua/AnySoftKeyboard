package com.menny.android.anysoftkeyboard.BiAffect.Database.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

@Entity
public class AccelerometerData {

    //Id is an autogenerated primary key. It keeps track of number of rows in the table
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int id;

    // timestamp in milliseconds when the accelerometer data was recorded
    @NonNull
    public long time;

    /*
    * Acceleration force along the x axis (including gravity).
    * Unit of measure : m/s2
    * */
    @NonNull
    public float Acc_X;

    /*
     * Acceleration force along the y axis (including gravity).
     * Unit of measure : m/s2
     * */
    @NonNull
    public float Acc_Y;

    /*
     * Acceleration force along the z axis (including gravity).
     * Unit of measure : m/s2
     * */
    @NonNull
    public float Acc_Z;

    public AccelerometerData(){
        //Default constructor
        // as all data members are public no need for getter and setter methods.
        // each data member defined in an @Entity class must be either public or have a getter method
    }
}
