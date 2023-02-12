package org.example;

public class Encoder {

    public static String encode(String inputStr) {

        if (inputStr == null) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int tail = inputStr.length() % 5;

        for (int i = 0; i < inputStr.length() - tail; i += 5) {
            result.append(new StringBuilder(inputStr.substring(i, i + 5)).reverse());
        }

        result.append(new StringBuilder(inputStr.substring(inputStr.length() - tail)).reverse());

        return result.toString();
    }

}
