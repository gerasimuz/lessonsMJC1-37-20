package edu.academy;

public class IteratorList {
    public static void main(String[] args) {
        int[] x = {2,5,6,7,8,9};
        int min = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i]<min){
                min = x[i];
            }
            System.out.println(x[i]);
        }
        System.out.println("минимальное значение "+min);
        
        //--------
        for (int num : x) {
            System.out.print(num+ " ");
        }
        //--------

    }

}
