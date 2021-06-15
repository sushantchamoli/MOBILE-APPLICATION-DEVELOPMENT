package com.example.myapplication1;

//package com.smartdukaan.sortinteger;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

public class BoundService  extends Service 
{
    private IBinder mBinder =  new LocalBoundedService();
    Random randomNumber = new Random();
    ArrayList<Integer> stringList = new ArrayList<>();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) 
    {
        stringList = intent.getIntegerArrayListExtra("list");
        return mBinder;
    }
    @Override
    public boolean onUnbind(Intent intent) 
    {
        return true;
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public  ArrayList<Integer>  genRandomNumber() {
        return (ArrayList<Integer>) stringList.stream().sorted().collect(Collectors.toList());
    }

    public class LocalBoundedService extends Binder 
    {
        BoundService getService() {
            return BoundService.this;
        }
    }
}
