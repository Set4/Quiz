package com.company.Question;


import java.util.Stack;
import  com.company.GuessIntervalNumber;

public class NumberQuestion extends QuestionBase<Integer> {


    private GuessIntervalNumber guessInterval;

    Stack<String> helpTexts;

    public NumberQuestion(int guessedQuestion, int totalAttempts, GuessIntervalNumber guessInterval) {
        super(guessedQuestion, totalAttempts);
        this.guessInterval = guessInterval;
        this.guessedQuestion = guessedQuestion;

        helpTexts = new Stack<String>();
    }


    public String GetQuestion() {
        return "Угадайте число в Интервале от " + guessInterval.getNumberFrom() + " до " + guessInterval.getNumberTo() +
                "за " + totalAttempts + " попыток.";
    }


    public boolean CheckAnswer(Integer answer) {
        doneAttempts++;


        if (answer == guessedQuestion)
            return true;


        GenerateHelp(answer);

        return false;
    }

    private void GenerateHelp(int falseAnswer) {
        String helpText;
        if (falseAnswer > guessedQuestion)
            helpText = "Загаданное цисло меньше " + falseAnswer;
        else
            helpText = "Загаданное цисло больше " + falseAnswer;

        helpTexts.add(helpText);
    }


    public String GetHelp() {
        String helpText = "";
        for (String text : helpTexts) {

            helpText += text;
            helpText += System.lineSeparator();
        }
        return helpText;
    }




}
