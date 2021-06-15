package com.example.mad_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mad_practical.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    // No Need of findViewById with use of viewBinding check my build.gradle(Module) to import viewBinding

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.outName.setText(getIntent().getStringExtra("name"));
        binding.outEmail.setText(getIntent().getStringExtra("email"));
        binding.outAge.setText(getIntent().getStringExtra("age"));
        binding.outPassword.setText(getIntent().getStringExtra("password"));
    }
}