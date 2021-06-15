package com.project.ques2;
/*Priyam Gupta
* sec-C
* Roll.no-47*/
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{
    // Array of strings...
    ListView simpleList;
    String[] countryList = {"India", "UK", "Canada", "Portugal", "America", "Russia"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}