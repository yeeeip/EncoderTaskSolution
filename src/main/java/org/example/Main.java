package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");

        System.out.println(Encoder.encode(in.nextLine()));
    }
}