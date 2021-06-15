package com.divya.simpleloginquestion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.divya.simpleloginquestion1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.submit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,UserDetailActivity.class);
            intent.putExtra("age",binding.editTextAge.getText().toString());
            intent.putExtra("name",binding.editTextPersonName.getText().toString());
            startActivity(intent);
        });
    }
}