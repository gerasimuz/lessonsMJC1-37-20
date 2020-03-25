package edu.academy;

import java.util.Arrays;
import java.util.Scanner;

public class UdalitPovtory {

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


            for (int i=array.length-1;i>0;i--){
                for (int j=0;j<i;j++){
                    if (array[j]>array[j+1]){
                        int prom = array[j];
                        array[j]=array[j+1];
                        array[j+1]=prom;
                    }
                }
            }
            System.out.println("массив после сортировки");
            System.out.println(Arrays.toString(array));

            //удаляем повторы
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        for (int k = j; k <array.length - 1; k++) {
                            array[k] = array[k + 1];
                        }
                        array[array.length - 1] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
}


