package com.company.Quiz;

import com.company.Question.NumberQuestion;
import com.company.GuessIntervalNumber;

public class GuessNumberQuiz extends QuizBase<NumberQuestion>{

    private int guessedNumber;

    private GuessIntervalNumber guessInterval;
    private int totalAttempts;

    public  GuessNumberQuiz(int totalAttempts, GuessIntervalNumber guessInterval)
    {
        this.totalAttempts = totalAttempts;
        this.guessInterval = guessInterval;
    }

    public NumberQuestion GetNextQuestion()
    {
        int max = guessInterval.getNumberTo() - guessInterval.getNumberFrom();
        guessedNumber = (int) (Math.random() * ++max) + guessInterval.getNumberFrom();

        return new NumberQuestion(guessedNumber, totalAttempts,guessInterval);
    }
}







