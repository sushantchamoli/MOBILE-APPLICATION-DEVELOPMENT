package com.example.localboundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

public class MyService extends Service {

    /**
     * Name: Arvind Singh
     * RollNo: 1018451
     */

    private IBinder myBinder = new MyBinder();
    private boolean isRandomGeneratorFlag = false;
    private int randomNumber;
    private final int START = 1;
    private final int END = 10;


    class MyBinder extends Binder {
        MyService getService()
        {
            return MyService.this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(), "Service created", Toast.LENGTH_SHORT);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), "Service onStartCommand() method executed", Toast.LENGTH_SHORT);

        if(isRandomGeneratorFlag==false)
        new Thread(new Runnable() {
            @Override
            public void run(){
                startRandomGenerator();
            }
        }).start();
        isRandomGeneratorFlag = true;

        return super.onStartCommand(intent, flags, startId);
    }

    private void startRandomGenerator(){
        while(isRandomGeneratorFlag)
        {
            try {
                Thread.sleep(2000);


                randomNumber = (int) (Math.random() * (END - START + 1)) + START;
                Log.i("BUG CHECK", "Thread with id and random number: " + Thread.currentThread().getId() + "  " + randomNumber);
            }
            catch(Exception e)
            {e.printStackTrace();}

        }
    }

    public int getRandomNumber()
    {
        return randomNumber;
    }

    @Override
    public void onDestroy() {
        isRandomGeneratorFlag = false;
        super.onDestroy();
    }

    public void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
}
