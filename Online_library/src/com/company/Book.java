package com.company;

import com.myIntеerface.IBook;

public class Book implements IBook {

    //метод определяет получил ли клиент книгу
    @Override
    public boolean GetBook() {
        //Метод может реализовывать любую логику
        //Возвращает значение "false" для примера
        return false;
    }

    //метод определяет вернул ли клиент книгу
    @Override
    public boolean ReturnedBook() {
        //Метод может реализовывать любую логику
        //Возвращает значение "false" для примера
        //Если поменять значение на "true", словим исключение
        return false;

    }
}
