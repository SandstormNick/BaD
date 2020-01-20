package com.example.nick.buildadictionary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HomeMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void addWordClick(View v){
        Intent intent = new Intent(HomeMainActivity.this, AddWordActivity.class);
        startActivity(intent);
    }

    public  void viewWordsClick (View v) {
        Intent intent = new Intent(HomeMainActivity.this, ViewWordsActivity.class);
        startActivity(intent);
    }

    public void searchWordsClick (View v) {
        Intent intent = new Intent(HomeMainActivity.this, SearchWordsActivity.class);
        startActivity(intent);
    }

}
