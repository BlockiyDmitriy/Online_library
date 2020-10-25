package com.company;

import com.myAbstruct.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonSerializable {
    ArrayList<Person> clients;
    ArrayList<Person> newClients;

    public PersonSerializable() {
        mainSer();
    }

    private void mainSer() {
        String filename = "people.dat";
        clients = new ArrayList<>();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(clients);
            System.out.println("Файл был сериализован");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        newClients = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newClients = (ArrayList<Person>) ois.readObject();
            display(newClients);
            System.out.println("Файл был десериализован");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void display(ArrayList<Person> newClients) {
        newClients.stream().forEach(p -> {
            System.out.printf("%s \t %s \t %s \t", p.getName(), p.getSurname(), p.getSurname());
        });
    }
}
