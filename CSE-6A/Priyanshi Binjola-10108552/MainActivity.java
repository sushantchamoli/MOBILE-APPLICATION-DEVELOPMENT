package com.priyanshiBinjola.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    String ss1[];
    String ss2[];
    int images[] = {
            R.drawable.aone,
            R.drawable.btwo,
    };

   
 RecyclerView recyclerView;
    RvAdapter.RCOnItemClickListener listener;

   
 @Override
    protected void onCreate(Bundle savedInstanceState) 
  {
     
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ss1 = getResources().getStringArray(R.array.country);
        ss2 = getResources().getStringArray(R.array.description);
        recyclerView = findViewById(R.id.recyclerView);
        setOnClickListener();
        RvAdapter rvAdapter = new RvAdapter(this,ss1,ss2,images,listener);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setOnClickListener() {
        listener = (v, position) -> {
            Intent intent = new Intent(getApplicationContext(),DataCountry.class);
            intent.putExtra("map",images[position]);
            intent.putExtra("title",ss1[position]);
            intent.putExtra("about",ss2[position]);
            startActivity(intent);

        };
    }
}