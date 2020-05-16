package edu.academy;

public class Main8 {
    public static void main(String[] args) {
        DataContainer<Integer> data= new DataContainer<>(10) ;
        data.add(123);
        data.add(4234);
        data.add(434);
        System.out.println(DataSum.sum(data));
    }
}
