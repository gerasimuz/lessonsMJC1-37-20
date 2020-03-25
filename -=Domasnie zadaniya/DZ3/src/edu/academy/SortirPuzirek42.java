package edu.academy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SortirPuzirek42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите количество элементов массива");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("введите сам массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        //вывод массива
        System.out.println(Arrays.toString(array));

        ///////////////////////
        //Пузырьковая сортировка
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int prom = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = prom;
                }
            }
        }
               System.out.println(Arrays.toString(array));
    }
}



