package me.sankalpchauhan.learningdagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheel;

    @Inject
    public Car(Engine engine, Wheels wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    
    public void drive(){
        Log.d(TAG, "drive:...");
    }
}
