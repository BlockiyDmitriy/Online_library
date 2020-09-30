package com.company;

import com.myAbstruct.Person;
import com.myException.ResultException;
import com.myIntеerface.IBook;
import com.myIntеerface.IOutput;

public class Client extends Person {

    public Client(String name, String surname, String lastName) {
        super(name, surname, lastName);

    }

    IBook iBook = new Book();

    boolean resGetBook = iBook.GetBook();
    boolean resReturnbook = iBook.ReturnedBook();

    IOutput iOutput = new Output();

    @Override
    public void display() throws ResultException {
        if (resGetBook == false && resReturnbook == true) throw new ResultException("Пользователь не получал книгу. Значение не может быть ", resReturnbook);
        iOutput.WriteMess(super.getName() + super.getLastName() + super.getSurname() + "\nПлучил книгу: " + resGetBook + "\nВернул книгу: " + resReturnbook);
    }
}
