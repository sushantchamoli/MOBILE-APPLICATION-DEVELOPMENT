package com.pulkitkumar.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    String s1[];
    String s2[];
    int images[] = {
            R.drawable.aone,
            R.drawable.btwo,
    };

    RecyclerView recyclerView;
    RvAdapter.RCOnItemClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = getResources().getStringArray(R.array.country);
        s2 = getResources().getStringArray(R.array.description);
        recyclerView = findViewById(R.id.recyclerView);
        setOnClickListener();
        RvAdapter rvAdapter = new RvAdapter(this,s1,s2,images,listener);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setOnClickListener() {
        listener = (v, position) -> {
            Intent intent = new Intent(getApplicationContext(),DataCountry.class);
            intent.putExtra("map",images[position]);
            intent.putExtra("title",s1[position]);
            intent.putExtra("about",s2[position]);
            startActivity(intent);

        };
    }
}