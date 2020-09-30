package com.myAbstruct;

import com.myException.ResultException;

public abstract class Person {
    private String name;
    private String surname;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Person(String name, String surname, String lastName) {
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
    }

    public abstract void display() throws ResultException;

}
