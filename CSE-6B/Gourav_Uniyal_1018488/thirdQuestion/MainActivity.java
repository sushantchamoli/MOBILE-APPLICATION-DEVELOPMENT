package com.endsem.thirdquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private WorkService workService;
    private boolean isBound = false;
    private ArrayList<Integer> arrayList;
    private ArrayAdapter<Integer> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(2355);
        arrayList.add(1);
        arrayList.add(453);
        arrayList.add(2446);
        arrayList.add(684);
        arrayList.add(342);
        arrayList.add(356);
        arrayList.add(789);
        arrayList.add(0);

        arrayAdapter = new ArrayAdapter<>(this, R.layout.row_item, arrayList);

        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        Intent intent = new Intent(this, WorkService.class);
        intent.putIntegerArrayListExtra("data", arrayList);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void sortNumbers(View view) {
        arrayList = workService.sortNumbers();
        arrayAdapter = new ArrayAdapter<>(this, R.layout.row_item, arrayList);
        listView.setAdapter(arrayAdapter);
    }

    private final ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            WorkService.LocalBinder binder = (WorkService.LocalBinder) service;
            workService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

}
