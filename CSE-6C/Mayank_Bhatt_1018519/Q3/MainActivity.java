package com.example.myapplication1;

//package com.smartdukaan.sortinteger;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity 
{
    BoundService mBoundService;
    Boolean mServiceBound = false;
    Button startService;
    TextView serviceText;
    TextView unsortedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService = (Button) findViewById(R.id.start);
        serviceText = (TextView) findViewById(R.id.serviceText);
        unsortedText = (TextView) findViewById(R.id.unsorted_service);

        startService.setOnClickListener(new View.OnClickListener() 
	{
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) 
	    {
                ArrayList<Integer> randomNuber = mBoundService.genRandomNumber();
                serviceText.setText(String.valueOf(randomNuber));
            }
        });

    }
    @Override
    protected void onStart() 
    {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(3);
        intList.add(6);
        intList.add(9);
        intList.add(2);

        unsortedText.setText(String.valueOf(intList));

        startService(new Intent(this, BoundService.class));
        Intent intent = new Intent(this,BoundService.class);
        intent.putIntegerArrayListExtra("list", intList);
        bindService(intent,mServiceConnection, Context.BIND_AUTO_CREATE);
        super.onStart();
    }
    @Override
    protected void onStop() 
    {
        unbindService(mServiceConnection);
        stopService(new Intent(this,BoundService.class));
        super.onStop();
    }

    private final ServiceConnection mServiceConnection = new ServiceConnection() {

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mServiceBound = false;
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            BoundService.LocalBoundedService myBinder = (BoundService.LocalBoundedService) service;
            mBoundService = myBinder.getService();
            mServiceBound = true;
        }
    };

}