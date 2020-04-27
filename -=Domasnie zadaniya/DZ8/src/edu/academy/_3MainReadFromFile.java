package edu.academy;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _3MainReadFromFile {

    public static void main(String[] args) throws IOException, ClassNotFoundException  {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src//edu//academy//students.bin"));

        ArrayList<Student> listStudents = new ArrayList<>();

        try {
            while (ois.available() != -1) {

                Student stud = (Student) ois.readObject();
                listStudents.add(stud);
            }
        } catch (EOFException ex) {
            //ex.printStackTrace();
        }
        //---------------------------------
        System.out.println("---unsorted list");
        System.out.println(listStudents.toString());


        //сортировка списка студентов
        Collections.sort(listStudents);
        System.out.println(" ");
        System.out.println("---sorted list");

        //и запись сортированного списка в файл -- studentList
        FileWriter writer = new FileWriter("src//edu//academy//studentsList.txt");
        writer.write("Сортированный по алфавиту список будет иметь вид:");
        for (Student stud: listStudents) {
            String name = stud.studentName;
            writer.write(name+System.getProperty("line.separator"));
            System.out.println(name);
        }

        writer.flush();
        writer.close();
    }

}

