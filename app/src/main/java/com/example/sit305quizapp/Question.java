package com.example.sit305quizapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Question extends AppCompatActivity implements View.OnClickListener {
    TextView nameText, countText, questionDetail;
    ProgressBar updateBar;
    Button answer1Button, answer2Button, answer3Button;
    Button submitButton;

    private int currentQuestionIndex = 0;
    private QuestionList[] questionBank = new QuestionList[]{
            new QuestionList(R.string.question_first, R.string.answer_first),
            new QuestionList(R.string.question_second, R.string.answer_second),
            new QuestionList(R.string.question_third, R.string.answer_third),
            new QuestionList(R.string.question_fourth, R.string.answer_first),
            new QuestionList(R.string.question_fifth, R.string.answer_second)
    };

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        //receive main activity name
        nameText = findViewById(R.id.nameText);
        Intent intent2 = getIntent();
        String name = intent2.getStringExtra("name");
        nameText.setText("Welcome: " + name + " to SIT305 quiz");
        questionDetail = findViewById(R.id.questionDetail);
        questionDetail.setText(R.string.question_first);

        answer1Button = findViewById(R.id.answer1Button);
        answer2Button = findViewById(R.id.answer2Button);
        answer3Button = findViewById(R.id.answer3Button);
        answer1Button.setOnClickListener(this);
        answer2Button.setOnClickListener(this);
        answer3Button.setOnClickListener(this);

        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.answer1Button:
                checkAnswer(R.string.answer_first);
                break;
            case R.id.answer2Button:
                checkAnswer(R.string.answer_second);
                break;
            case R.id.answer3Button:
                checkAnswer(R.string.answer_third);
                break;
            case R.id.submitButton:
                currentQuestionIndex = (currentQuestionIndex + 1) % questionBank.length;
                update();
                if(currentQuestionIndex == questionBank.length - 1){
                    Intent intent2 = new Intent(this, Result.class);
                    startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    private void update() {
        questionDetail.setText(questionBank[currentQuestionIndex].getQuestionIndex());
    }

    private void checkAnswer(int answer_index) {
        int userChoose = questionBank[currentQuestionIndex].getAnswerTrueIndex();
        if(answer_index == userChoose){
            count += 1;
            //countText.setText(count);
        } else {
            Toast.makeText(Question.this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
}