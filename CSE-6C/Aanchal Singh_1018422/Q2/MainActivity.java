package com.nkm.gesture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
String animals[] = {"lion","Cheetah","Impala","Moose","lemming","Monkey","Elephant"};
String animal_pic_urls[] = {"https://i.natgeofe.com/n/80b97fe3-c0fb-40a6-a6a6-88b5c3bb9d30/01-lion-populations-nationalgeographic_1777804.jpg","https://content.jwplatform.com/thumbs/h5Ko1nUT-720.jpg","https://africafreak.com/wp-content/uploads/2019/10/impala-ram-golden-light.jpg","https://cdn.britannica.com/57/92857-050-8D5A0A8E/bull-moose-water.jpg","https://cdn.hswstatic.com/gif/lemming-1.jpg","https://site-547756.mozfiles.com/files/547756/medium/monkey-berber-monkeys-mammal-affchen-50988.jpeg","https://cdn.mos.cms.futurecdn.net/uiCrUgVCf64TzEdTM8x9aD-1200-80.jpg"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
        Intent i = new Intent(MainActivity.this, MainActivity2.this);
    }
}