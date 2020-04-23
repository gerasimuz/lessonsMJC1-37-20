package edu.academy;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count=0, input = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("вам осталсь " + (3 - count) + " попытки.");
            count++;

            try {
                System.out.println("введите число от 1 до 10");
                input = scanner.nextInt();
            } catch (InputMismatchException e){
                System.err.println("Вы ввели текст, а не число.Текст не допустим. Повторите попытку.");
                scanner.next();
                }
            
            } while ((count < 3) && ((input < 1) || (input > 10)));

        System.out.println("вы ввели число " + input);
    }

}
