package com.divya.simpleloginquestion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.divya.simpleloginquestion1.databinding.ActivityUserDetailBinding;

public class UserDetailActivity extends AppCompatActivity {

    ActivityUserDetailBinding binding;
    String age,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityUserDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if(getIntent()!=null) {
            age = getIntent().getStringExtra("age");
            binding.age.setText(age);
            name = getIntent().getStringExtra("name");
            binding.name.setText(name);
        }
    }
}