package edu.MyLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda2 {

    private static void fillList(List<Integer> list1){
        for (int i = 0; i < 10; i++) {
            list1.add(i+1);
        }
    }

    private static void fillArray(int[] array1){
        for (int i = 0; i < array1.length; i++) {
            array1[i]=i+1;
        }
    }

    //-----
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArray(array1);
        fillList(list1);

        //map method
        array1 = Arrays.stream(array1).map(a -> a*2).toArray();
        list1 = list1.stream().map(a -> a*2).collect(Collectors.toList());

        //filter method
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArray(array2);
        fillList(list2);
        array2 = Arrays.stream(array2).filter(a -> a%2 == 0).toArray();
        list2 = list2.stream().filter (a -> a% 2 == 0).collect(Collectors.toList());

        int sum1 = Arrays.stream(array2).reduce((acc,b)-> acc+b).getAsInt();
        int sum2 = list2.stream().reduce((acc,b)-> acc*b).get();
        System.out.println(sum1);
        System.out.println(sum2);
    }

}
