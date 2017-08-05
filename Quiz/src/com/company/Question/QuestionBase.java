package com.company.Question;

public abstract class QuestionBase<T>
{
    protected T guessedQuestion;
    public  QuestionBase(T guessedQuestion,int totalAttempts)
    {
        this.totalAttempts=totalAttempts;
        this.guessedQuestion=guessedQuestion;
    }



    public abstract String GetQuestion();

    public abstract boolean CheckAnswer(T answer);

    public abstract String GetHelp();


    protected int totalAttempts;
    public int getTotalAttempts() {
        return totalAttempts;
    }

    protected int doneAttempts;
    public int getDoneAttempts() {
        return doneAttempts;
    }

    public T getTrueAnswer()
    {
        return guessedQuestion;
    }
}
