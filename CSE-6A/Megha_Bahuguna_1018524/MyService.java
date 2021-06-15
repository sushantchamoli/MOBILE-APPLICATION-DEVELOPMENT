package com.example.q3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

public class MyService extends Service {
    private ArrayList<Integer> integers;
    private final IBinder binder = new LocalBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        integers = intent.getIntegerArrayListExtra("data");
        return binder;
    }

    public ArrayList<Integer> sortNumbers() {
        Collections.sort(integers);
        return integers;
    }

    public class LocalBinder extends MyService {
        MyService getService() {
            return MyService.this;
        }
    }

}