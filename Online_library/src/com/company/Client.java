package com.company;

import com.myAbstruct.Person;
import com.myException.ResultException;
import com.myIntеerface.IBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client extends Person {

    ArrayList<Client> clients = new ArrayList<>();
    Map<ArrayList, Boolean> personBookMap = new HashMap<>();

    public Client(String name, String surname, String lastName) throws ResultException {
        super(name, surname, lastName);
        display();
    }

    IBook iBook = new Book();

    boolean resGetBook = iBook.GetBook();
    boolean resReturnbook = iBook.ReturnedBook();

    @Override
    public void display() throws ResultException {

        if (resGetBook == false && resReturnbook == true) {
            throw new ResultException("Пользователь не получал книгу. Значение не может быть ", resReturnbook);
        }
        System.out.print(super.getName() + super.getLastName() + super.getSurname() + "\nПлучил книгу: " + resGetBook + "\nВернул книгу: " + resReturnbook);
    }

    public void ValidMap(Client client) {
        clients.add(client);
        for (var i :
                clients) {
            personBookMap.put(clients, resReturnbook);
            boolean res = personBookMap.get(clients);
            System.out.println("\nMap "+res);
        }
    }
}
