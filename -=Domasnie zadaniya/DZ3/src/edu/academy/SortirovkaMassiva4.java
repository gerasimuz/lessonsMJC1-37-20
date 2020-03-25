package edu.academy;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import  java.util.Scanner;

public class SortirovkaMassiva4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите количество элементов массива");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("введите сам массив");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        //вывод массива
        System.out.println(Arrays.toString(array));

        //сортировка массива выбором
        for (int i=0;i<array.length;i++){
            int min = array[i];
            int min_i = i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<min)   {
                    min = array[j];
                    min_i =j;
                }
                }
            if (i!=min_i){
                int prom = array[i];
                array[i]=array [min_i];
                array[min_i] = prom;
            }
        }
        System.out.println("массив после сортировки");
        System.out.println(Arrays.toString(array));

    }

}
