//Name: Piyush Bisht
//RollNo:1018542
//Section:C

package com.example.localservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MyService extends Service {
    // Binder given to clients
    private final IBinder mBinder=new LocalBinder();



    public class LocalBinder extends Binder{
        MyService getService(){
            // Return this instance of LocalService so clients can call public methods
            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }


    public ArrayList<Integer> sortArray(ArrayList<Integer> aa)
    {
        Collections.sort(aa);
        return aa;
    }
}
