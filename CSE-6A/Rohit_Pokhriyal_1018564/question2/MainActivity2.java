package com.rohitpokhriyal.ques2;
//created by rohit pokhriyal
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {
    TextView countryText,countryData;
    String stringCountry,stringCountryData,stringImg;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        countryText =findViewById(R.id.text_country);
        countryData = findViewById(R.id.text_country_data);
        imageView = findViewById(R.id.img);
        Intent intent = getIntent();
        stringCountry = intent.getStringExtra("country");
        stringCountryData = intent.getStringExtra("data");
        stringImg = intent.getStringExtra("img");
        System.out.println(stringImg);
        countryText.setText(stringCountry);
        countryData.setText(stringCountryData);
        Glide.with(this).load(stringImg).into(imageView);

    }
}