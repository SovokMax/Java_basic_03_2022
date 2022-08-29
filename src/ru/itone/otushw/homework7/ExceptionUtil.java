package ru.itone.otushw.homework7;

import java.io.FileNotFoundException;

public class ExceptionUtil {

    public void throwFileNotFoundException () throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    public void newMyException () throws MyException {
        try {
            throwFileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new MyException("Новое исключение");
        }
    }
}
