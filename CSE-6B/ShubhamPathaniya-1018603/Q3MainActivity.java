package com.example.q3byshubhampathaniya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SortService sortService;
    private boolean isBound = false;
    private ArrayList<Integer> integerList;
    private ArrayAdapter<Integer> integerArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        integerList = new ArrayList<>();
        integerList.add(95);
        integerList.add(5);
        integerList.add(55);
        integerList.add(520);
        integerList.add(0);
        integerList.add(65);
        integerList.add(58);
        integerList.add(23);
        integerList.add(786);

        integerArrayAdapter = new ArrayAdapter<>(this, R.layout.row_integer, integerList);

        listView = findViewById(R.id.listView);
        listView.setAdapter(integerArrayAdapter);

        Intent intent = new Intent(this, SortService.class);
        intent.putIntegerArrayListExtra("data", integerList);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void sortNumbers(View view) {
        integerList = sortService.sortNumbers();
        integerArrayAdapter = new ArrayAdapter<>(this, R.layout.row_integer, integerList);
        listView.setAdapter(integerArrayAdapter);
    }

    private final ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            SortService.LocalBinder binder = (SortService.LocalBinder) service;
            sortService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

}
