package com.example.q3endtermtushardarmora;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting extends Service {
    private ArrayList<Integer> integers;
    private final IBinder binder = new LocalBinder();
    private static final String TAG = "Sorting";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        integers = intent.getIntegerArrayListExtra("Values");
        Log.d(TAG, "onBind: "+integers);
        return binder;
    }

    public ArrayList<Integer> sortNumbers() {
        Collections.sort(integers);
        return integers;
    }

    public class LocalBinder extends Binder {
        Sorting getService() {
            return Sorting.this;
        }
    }

}
