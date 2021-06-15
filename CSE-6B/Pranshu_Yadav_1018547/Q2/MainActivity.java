package com.codewithshadow.androidexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    GridLayoutManager manager;
    Adapter adapter;
    List<Map<String, String>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("name","India");
        map.put("img","data:image/png;base64,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");
        map.put("data","India, officially the Republic of India, is a country in South Asia. It is the second-most populous country, the seventh-largest country by land area, and the most populous democracy in the world.");


        Map<String, String> map2 = new HashMap<>();
        map2.put("name","America");
        map2.put("img","https://images-na.ssl-images-amazon.com/images/I/61SiPzQldpL._AC_SL1500_.jpg");
        map2.put("data","The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC. ");



        list.add(map);
        list.add(map2);


        manager = new GridLayoutManager(this, 2);
        adapter = new Adapter(this,list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}