package com.example.sit305quizapp;

public class QuestionList {
    private int questionIndex;
    private int answerTrueIndex;

    public QuestionList(int questionIndex, int answerTrueIndex){
        this.questionIndex = questionIndex;
        this.answerTrueIndex = answerTrueIndex;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public int getAnswerTrueIndex() {
        return answerTrueIndex;
    }

    public void setAnswerTrueIndex(int answerTrueIndex) {
        this.answerTrueIndex = answerTrueIndex;
    }
}
