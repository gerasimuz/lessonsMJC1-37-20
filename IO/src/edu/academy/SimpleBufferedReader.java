package edu.academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferedReader {
    public SimpleBufferedReader() throws IOException {
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String num = br.readLine();
//            System.out.println(num);


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            int i2 = inputStreamReader.read();
            System.out.println((char)i2);



    }
}
