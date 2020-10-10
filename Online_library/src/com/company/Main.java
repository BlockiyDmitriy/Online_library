package com.company;

import com.myException.ResultException;

public class Main {

    public static void main(String[] args) {
        try {
            Client client = new Client("Din ", " ", "Winchester ");
            client.ValidMap(client);
        } catch (ResultException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.isResult());
        }

    }
}
