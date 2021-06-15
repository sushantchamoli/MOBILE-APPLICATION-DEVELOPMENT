//Name : Saurabh Chauhan
//Sec : C
//ROLL NO:58
package com.example.practical3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;

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
        Arrays.sort(a); // sort
        return a;
    }

    public class MyLocalBinder extends Binder {
        MyLocalBoundService getService() {//lower bound
            return MyLocalBoundService.this;
        }
    }

}