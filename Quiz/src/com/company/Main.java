package com.company;

import com.company.Question.QuestionBase;
import com.company.Quiz.GuessNumberQuiz;
import com.company.Quiz.QuizBase;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        QuizBase quiz=new GuessNumberQuiz(5, new GuessIntervalNumber(1,10));

        QuestionBase<Integer> question=null;
        while (true)
        {
            System.out.println("Новая игра");
            question= (QuestionBase<Integer>)quiz.GetNextQuestion();
            if(question==null)
             break;

            while (question.getTotalAttempts()-question.getDoneAttempts()>0)
            {
                System.out.println(question.GetQuestion());
                int answer=in.nextInt();
                if(question.CheckAnswer(answer)) {
                    System.out.println("Верно угадано!!!");
                    break;
                }

                System.out.println("Не угадали.");
                System.out.println(question.GetHelp());
            }

           if(question.getTotalAttempts()-question.getDoneAttempts()<1) {
               System.out.print("Попытки закончились. Вы не угадали число: ");
               System.out.println(question.getTrueAnswer());
          }


        }

    }
}
