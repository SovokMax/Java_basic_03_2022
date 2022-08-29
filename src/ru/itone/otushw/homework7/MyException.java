package ru.itone.otushw.homework7;

public class MyException extends Exception {
    private String description;

    public MyException(String description) {
        super();
        this.description = description;
    }
}
