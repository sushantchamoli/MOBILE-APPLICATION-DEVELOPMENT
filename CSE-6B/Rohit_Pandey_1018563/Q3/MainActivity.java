package com.example.end_sem_q2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    MyLocalBoundService mService;
    boolean isBound = false;
    ArrayList<Integer> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>(Arrays.asList(5,2,7,78,32,56,11,3,0,12,99,45));
        Intent intent = new Intent(this, MyLocalBoundService.class);
        bindService(intent, myConnection, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection myConnection = new ServiceConnection()
    {

        public void onServiceConnected(ComponentName className,
                                       IBinder service) {
            MyLocalBoundService.MyLocalBinder binder = (MyLocalBoundService.MyLocalBinder) service;
            mService = binder.getService();
            isBound = true;
        }

        public void onServiceDisconnected(ComponentName arg0) {
            isBound = false;
        }
    };

    public void showSorted(View view)
    {
        int a[] = new int[list.size()];

        for(int i = 0 ; i<a.length ; i++)a[i] = list.get(i);a = mService.getSortedArray(a);
        String to_show = "";
        for(int i:a){
            to_show += String.valueOf(i)+" ";
        }
        TextView myTextView =
                (TextView)findViewById(R.id.mTextview);
        myTextView.setText(to_show);
    }
}