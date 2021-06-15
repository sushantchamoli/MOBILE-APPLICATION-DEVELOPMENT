package com.example.mad_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.mad_practical.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // No Need of findViewById with use of viewBinding check my build.gradle(Module) to import viewBinding

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.submit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", binding.name.getText().toString());
            intent.putExtra("age", binding.age.getText().toString());
            intent.putExtra("email", binding.email.getText().toString());
            intent.putExtra("password", binding.password.getText().toString());
            startActivity(intent);
        });
    }
}