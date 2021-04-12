package com.example.sit305quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button startButton;
    EditText editNameTextView;
    public void jumpClick(View view){
        Intent intent1 = new Intent(this, Question.class);
        intent1.putExtra("name", editNameTextView.getText().toString());
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.startButton);
        editNameTextView = findViewById(R.id.editNameTextView);
    }
}