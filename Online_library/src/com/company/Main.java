package com.company;

import com.myAbstruct.Person;
import com.myException.ResultException;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        try {
            Client client = new Client("Din ", " ", "Winchester ");
            client.ValidMap(client);
            System.out.println("Serializable");
            client.display();
            PersonSerializable personSerializable = new PersonSerializable();
            Optional<PersonSerializable> personSerializableOptional = Optional.of(personSerializable);
            PersonSerializable serializable = personSerializableOptional.orElse(new PersonSerializable());
        }catch (ResultException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.isResult());
        }
    }
}
