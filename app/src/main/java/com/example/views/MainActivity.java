package com.example.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        
        setContentView(amb.getRoot());
    }
}