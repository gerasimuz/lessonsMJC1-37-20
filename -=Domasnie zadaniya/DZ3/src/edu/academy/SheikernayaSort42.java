package edu.academy;

import java.util.Arrays;
import java.util.Scanner;

public class SheikernayaSort42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите количество элементов массива");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("введите сам массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        //вывод массива до сортировки
        System.out.println(Arrays.toString(array));

        //Шейкерная сортировка
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
