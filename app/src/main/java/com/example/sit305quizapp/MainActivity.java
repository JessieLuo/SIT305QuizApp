package com.example.sit305quizapp;

import androidx.annotation.Nullable;
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
        Intent intent = new Intent(this, Question.class);
        intent.putExtra("name", editNameTextView.getText().toString());
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.startButton);
        editNameTextView = findViewById(R.id.editNameTextView);
    }

    //receive result activity data

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        finishActivity(2);
    }
}