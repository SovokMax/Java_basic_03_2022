package ru.itone.otushw.homework4;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int result = 0;
        Question[] questions = {
                new Question("Первый вопрос. Сколько пальцев на человеческой руке? 1)Два 2)Три 3)Пять 4)Семь", "3"),
                new Question("Второй вопрос. Сколько букв в русском алфавите?   1)15  2)20 3)40 4)33", "3"),
                new Question("Третий вопрос. Какое животное находится под защитой закона в Риме?   1)Курицы  2)Собаки 3)Кошки 4)Львы", "3"),
                new Question("Четвертый вопрос. Какое самое быстрое сухопутное животное?   1)Гепард  2)Лев 3)Тигр 4)Леопард", "3"),
                new Question("Пятый вопрос. Сколько костей у акул? 1)Четыре  2)Ноль 3)Пять 4)Десять", "3")
        };

        System.out.println("Привет, это игра Квиз! Тебе нужно ответить на 5 вопросов");
        for (int questionsNumber = 0; questionsNumber <questions.length; questionsNumber++) {
            System.out.println(questions[questionsNumber].getQuestion());
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equals(questions[questionsNumber].getAnswer())) {
                result++;
                System.out.println("Правильно! Продолжим :) Твой результат: " + result + " из 5");
            } else {
                System.out.println("Ты ошибся! Но ничего страшного. Продолжим Твой результат: " + result + " из 5");
            }
        }

    }
}
