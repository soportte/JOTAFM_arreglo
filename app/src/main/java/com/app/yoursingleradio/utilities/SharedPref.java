package com.app.yoursingleradio.utilities;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.core.content.ContextCompat;

import com.app.yoursingleradio.R;

public class SharedPref {

    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPref(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("setting", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public int getFirstColor () {
        return sharedPreferences.getInt("first", ContextCompat.getColor(context, R.color.colorPrimaryDark));
    }

    public int getSecondColor () {
        return sharedPreferences.getInt("second", ContextCompat.getColor(context, R.color.colorPrimary));
    }

    public void setCheckSleepTime() {
        if(getSleepTime() <= System.currentTimeMillis()) {
            setSleepTime(false, 0, 0);
        }
    }

    public void setSleepTime(Boolean isTimerOn, long sleepTime, int id) {
        editor.putBoolean("isTimerOn", isTimerOn);
        editor.putLong("sleepTime", sleepTime);
        editor.putInt("sleepTimeID", id);
        editor.apply();
    }

    public Boolean getIsSleepTimeOn () {
        return sharedPreferences.getBoolean("isTimerOn",false);
    }

    public long getSleepTime () {
        return sharedPreferences.getLong("sleepTime",0);
    }

    public int getSleepID () {
        return sharedPreferences.getInt("sleepTimeID",0);
    }
}