package com.example.customedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etFirstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etFirstName);

        String[] names = {"James", "John", "Jenny", "Jennnifer", "Jack", "Johnny"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, R.layout.custom_design_autocomplete, names);

        etFirstName.setThreshold(1);
        etFirstName.setAdapter(adapter);
    }
}