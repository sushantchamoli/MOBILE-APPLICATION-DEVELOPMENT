package com.urvashi.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Recycller_class adapter;

//String name given by us.
String monthNames[]={"India","America","Ukraine","Australia","Europe","Afganistan","France","England","Afganistan","Combodia","Greece"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        //recyclerView
        recyclerView=findViewById(R.id.reclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //adapter class
        adapter=new Recycller_class(this, monthNames);
        recyclerView.setAdapter(adapter);

    }
}