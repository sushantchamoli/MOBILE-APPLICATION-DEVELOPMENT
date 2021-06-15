package com.example.boundedservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Arrays;

public class MyService extends Service {
    private final IBinder myBinder = new MyLocalBinder();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    public int[] getSortedArray(int[] a) {
        Arrays.sort(a);
        return a;
    }

    public class MyLocalBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }
    }
}