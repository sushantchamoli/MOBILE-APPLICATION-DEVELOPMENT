package com.example.q3endtermtushardarmora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Sorting sortService;
    private boolean isBound = false;
    private ArrayList<Integer> integerList;
    private ArrayAdapter<Integer> integerArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        integerList = new ArrayList<>();
        integerList.add(47);
        integerList.add(11);
        integerList.add(65);
        integerList.add(99);
        integerList.add(45);
        integerList.add(33);
        integerList.add(62);
        integerList.add(88);
        integerList.add(6);

        integerArrayAdapter = new ArrayAdapter<>(this, R.layout.activity_sorting, integerList);

        listView = findViewById(R.id.listView);
        listView.setAdapter(integerArrayAdapter);

        Intent intent = new Intent(this, Sorting.class);
        intent.putIntegerArrayListExtra("Values", integerList);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void sortNumbers(View view) {
        integerList = sortService.sortNumbers();
        integerArrayAdapter = new ArrayAdapter<>(this, R.layout.activity_sorting, integerList);
        listView.setAdapter(integerArrayAdapter);
    }

    private final ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            Sorting.LocalBinder binder = (Sorting.LocalBinder) service;
            sortService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

}