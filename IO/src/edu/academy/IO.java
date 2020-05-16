package edu.academy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("hello1.txt",true));
        BufferedWriter out2 = new BufferedWriter(new FileWriter("hello2.txt", true));

        long m1 = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            out1.append("Привет");
            out1.flush();
        }
        long m2 = System.currentTimeMillis();
        System.out.println(m2-m1);



        for (int i = 0; i <1000000 ; i++) {
            out2.append("Привет");
            if (i % 10 == 0) {
                out2.flush();
            }
        }
        long m3 = System.currentTimeMillis();
        System.out.println(m3-m2);


    }
}
