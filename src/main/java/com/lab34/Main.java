package com.lab34;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 6666);

        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать на сервер <AlisaFalloutServer>, введите свой вопрос, либо exit для выхода");
        while (sc.hasNext()) {
            var input = sc.nextLine();

            if (input.equals("close")) {
                client.sendMessage("close");
                client.stopConnection();
                return;
            }

            String response = client.sendMessage(input);
            System.out.println("Server: " + response);
            System.out.println("Введите следующий вопрос, либо exit для выхода");
        }
    }
}