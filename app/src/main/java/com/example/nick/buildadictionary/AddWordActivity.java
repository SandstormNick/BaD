package com.example.nick.buildadictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddWordActivity extends AppCompatActivity {

    private Spinner wordTypeSpinner;
    private static final String[] wordTypes = {"Word Type", "verb", "noun"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        wordTypeSpinner = findViewById(R.id.wordTypeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AddWordActivity.this, R.layout.support_simple_spinner_dropdown_item, wordTypes);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        wordTypeSpinner.setAdapter(adapter);
    }
}
