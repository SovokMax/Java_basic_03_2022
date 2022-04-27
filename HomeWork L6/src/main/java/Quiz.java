import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        int correctAnswerOne;
        int correctAnswerTwo;
        int correctAnswerThree;
        int correctAnswerFour;
        int correctAnswerFive;
        int result = 0;
        int [] Answer = {1, 2, 3, 4};
        System.out.println("Привет, это игра Квиз! Тебе нужно ответить на 5 вопросов");

        System.out.println("Первый вопрос. Сколько пальцев на человеческой руке? 1)Два 2)Три 3)Пять 4)Семь");
        Scanner sc = new Scanner(System.in);
        correctAnswerOne = sc.nextInt();
        if (correctAnswerOne == Answer [2]) {
            result++;
            System.out.println("Правильно! Продолжим :) Твой результат: " + result + " из 5");
        } else {
            System.out.println("Ты ошибся! Но ничего страшного. Продолжим Твой результат: " + result + " из 5");
        }

        System.out.println("Второй вопрос. Сколько букв в русском алфавите?   1)15  2)20 3)40 4)33");
        correctAnswerTwo = sc.nextInt();
        if (correctAnswerTwo == Answer [3]) {
            result++;
            System.out.println("Правильно! Продолжим :) Твой результат: " + result + " из 5");
        } else {
            System.out.println("Ты ошибся! Но ничего страшного. Продолжим Твой результат: " + result + " из 5");
        }

        System.out.println("Третий вопрос. Какое животное находится под защитой закона в Риме?   1)Курицы  2)Собаки 3)Кошки 4)Львы");
        correctAnswerThree = sc.nextInt();
        if (correctAnswerThree == Answer [2]) {
            result++;
            System.out.println("Правильно! Продолжим :) Твой результат: " + result + " из 5");
        } else {
            System.out.println("Ты ошибся! Но ничего страшного. Продолжим Твой результат: " + result + " из 5");
        }

        System.out.println("Четвертый вопрос. Какое самое быстрое сухопутное животное?   1)Гепард  2)Лев 3)Тигр 4)Леопард");
        correctAnswerFour = sc.nextInt();
        if (correctAnswerFour == Answer [0]) {
            result++;
            System.out.println("Правильно! Продолжим :) Твой результат: " + result + " из 5");
        } else {
            System.out.println("Ты ошибся! Но ничего страшного. Продолжим Твой результат: " + result + " из 5");
        }

        System.out.println("Пятый вопрос. Сколько костей у акул? 1)Четыре  2)Ноль 3)Пять 4)Десять");
        correctAnswerFive = sc.nextInt();
        if (correctAnswerFive == Answer [1]) {
            result++;
            System.out.println("Правильно! Продолжим :) Твой результат: " + result + " из 5");
        } else {
            System.out.println("Ты ошибся! Но ничего страшного. Продолжим Твой результат: " + result + " из 5");
        }
        System.out.println("Всего ты смог набрать баллов: " + result );
    }
}
