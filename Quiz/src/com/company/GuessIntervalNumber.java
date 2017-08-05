package com.company;

public class GuessIntervalNumber
{
    public GuessIntervalNumber(int numberFrom, int numberTo)
    {
        this.numberFrom=numberFrom;
        this.numberTo=numberTo;
    }

    private int numberFrom;
    public int getNumberFrom() {
        return numberFrom;
    }

    private int numberTo;
    public int getNumberTo() {
        return numberTo;
    }
}
