package com.example.end_sem_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;

import java.util.Arrays;


public class MyLocalBoundService extends Service {
    private final IBinder myBinder = new MyLocalBinder();

    public MyLocalBoundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return myBinder;
    }

    public int[] getSortedArray(int[] a) {
        Arrays.sort(a);
        return a;
    }

    public class MyLocalBinder extends Binder {
        MyServiceLocal getService() {
            return MyLocalBoundService.this;
        }
    }
}