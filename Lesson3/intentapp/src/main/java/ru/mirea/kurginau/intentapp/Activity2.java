package ru.mirea.kurginau.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private EditText text;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        String t = (String) getIntent().getSerializableExtra("key");
        text = findViewById(R.id.newTextView);
        text.setText(t.toString());
    }
}