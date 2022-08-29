package ru.itone.otushw.homework7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        ExceptionUtil util = new ExceptionUtil();
        try {
            util.throwFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Обработал исключение FileNotFoundException");
        }
        try {
            util.newMyException();
        } catch (MyException e) {
            System.out.println("Обработал свое исключение");
        }
        try(FileReader fileReader = new FileReader("Несуществующий файл")){

        } catch (FileNotFoundException e) {
            System.out.println("Файла не существует");
        } catch (IOException e) {
            System.out.println("Ошибка чтения данных");
        } finally {
            System.out.println("Тест");
        }
    }

}
