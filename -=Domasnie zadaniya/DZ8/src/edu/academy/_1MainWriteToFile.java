package edu.academy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _1MainWriteToFile {
    //создаем 100000 обьектов типа студент со случайным именем и записываем в файл.!!!!!!!!!
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src//edu//academy//students.bin"))){
            for (int i = 0; i < 100 ; i++) {
                Student s = new Student();
                oos.writeObject(s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
