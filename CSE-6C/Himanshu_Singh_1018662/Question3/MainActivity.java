package com.example.practicalthree;

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

//End-Sem Practical Exam//

//Code Created by Himanshu Singh(1018662)//

//Main Activity Code//

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SortActivity sortActivity;
    private boolean isBound = false;
    private ArrayList<Integer> integerList;
    private ArrayAdapter<Integer> integerArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        integerList = new ArrayList<>();
        integerList.add(29);
        integerList.add(4);
        integerList.add(71);
        integerList.add(479);
        integerList.add(1);
        integerList.add(33);
        integerList.add(15);
        integerList.add(67);
        integerList.add(147);

        integerArrayAdapter = new ArrayAdapter<>(this, R.layout.row_activity, integerList);

        listView = findViewById(R.id.listView);
        listView.setAdapter(integerArrayAdapter);

        Intent intent = new Intent(this, SortActivity.class);
        intent.putIntegerArrayListExtra("data", integerList);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void sortNumbers(View view) {
        integerList = sortActivity.sortNumbers();
        integerArrayAdapter = new ArrayAdapter<>(this, R.layout.row_activity, integerList);
        listView.setAdapter(integerArrayAdapter);
    }

    private final ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            SortActivity.LocalBinder binder = (SortActivity.LocalBinder) service;
            sortActivity = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

}
