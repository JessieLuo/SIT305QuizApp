package com.example.sit305quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity implements View.OnClickListener {
    Button finishButton, takeNewButton;
    TextView scoreText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        int resultScore = intent.getIntExtra("score", 0);
        scoreText = findViewById(R.id.scoreText);
        scoreText.setText(String.valueOf(resultScore) + "/5");

        finishButton = findViewById(R.id.finishButton);
        takeNewButton = findViewById(R.id.takeNewButton);
        finishButton.setOnClickListener(this);
        takeNewButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.finishButton:
                Toast.makeText(Result.this, "You have finished!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.takeNewButton:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivityForResult(intent2, 2);
                break;

        }
    }
}