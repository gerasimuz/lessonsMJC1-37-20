package edu.academy;

public class Main {
    private static String TEXT = "SOME TEXT HERE";

    public static void main(String[] args) {
        System.out.println(TEXT);

        printText("ЯВА это круто. не джава", 5);
    }


    public static void printText(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}


