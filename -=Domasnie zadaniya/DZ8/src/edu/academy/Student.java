package edu.academy;

import org.w3c.dom.ls.LSOutput;

import java.io.Serializable;
import java.util.Random;

public class Student implements Serializable, Comparable<Student> {
    public String studentName;

    public Student() {

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder randString = new StringBuilder();
        Random rand = new Random();
        int count = (1+(int) (Math.random() * 20));//генерируем студенту случайное имя

        for (int i = 0; i < count; i++) {
            char c = chars[rand.nextInt(chars.length)];
            randString.append(c);
        }
        System.out.println(randString.toString());
        this.studentName = randString.toString();
//        this.studentName = studentNameUp.substring(0, 1).toUpperCase() + studentNameUp.substring(1);//делаем 1букву Большой

    }


    public String toString() {
        String str = "- " + this.studentName + " ";
        return str;
    }


    @Override
    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);
    }
}
