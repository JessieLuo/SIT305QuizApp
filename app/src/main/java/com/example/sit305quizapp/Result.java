package com.example.sit305quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Result extends AppCompatActivity implements View.OnClickListener {
    Button finishButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        finishButton = findViewById(R.id.finishButton);
        finishButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Result.this, "You have finished!", Toast.LENGTH_SHORT).show();
    }
}