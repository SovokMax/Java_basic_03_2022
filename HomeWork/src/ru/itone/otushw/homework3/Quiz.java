package ru.itone.otushw.homework3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int result = 0;
        String[] answer = {"3", "4", "3", "1", "2"};
        String[] quizQuestions = {
                "»»» Первый вопрос ««« \nСколько пальцев на человеческой руке? \n1)Два 2)Три 3)Пять 4)Семь",
                "»»» Второй вопрос ««« \nСколько букв в русском алфавите?    \n1)15  2)20 3)40 4)33",
                "»»» Третий вопрос ««« \nКакое животное находится под защитой закона в Риме?    \n1)Курицы  2)Собаки 3)Кошки 4)Львы",
                "»»» Четвертый вопрос ««« \nКакое самое быстрое сухопутное животное?   \n1)Гепард  2)Лев 3)Тигр 4)Леопард",
                "»»» Пятый вопрос ««« \nСколько костей у акул?  \n1)Четыре  2)Ноль 3)Пять 4)Десять"
        };

        System.out.println("========== Привет, это игра Квиз! ==========  \nТебе нужно ответить на 5 вопросов");
        for (int questionsNumber = 0; questionsNumber < quizQuestions.length; questionsNumber++) {
            System.out.println(quizQuestions[questionsNumber]);
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equals(answer[questionsNumber])) {
                result++;
                System.out.println("Правильно! \nТвой результат: " + result + " из 5");
            } else {
                System.out.println("Ты ошибся! Но ничего страшного. \nТвой результат: " + result + " из 5");
            }
        }
    }
}