package edu.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String textMy = Main.readAllBytes();
        String [] textMy_array = textMy.split("\\s|\\b");//РАЗБИЛИ ПО ПРОБЕЛУ И ТОЧКЕ НА МАССИВ СТРОК

        //заносим массив строк в arraylist
        ArrayList <String> textMy_list = new ArrayList<>();
        for (int i = 0; i < textMy_array.length ; i++) {
        textMy_list.add (textMy_array[i]);
        }
        EasySearch slovo = new EasySearch();
        System.out.println("Слово война встречается " + slovo.search(textMy_list,"война"));
        System.out.println("Слово и встречается " + slovo.search(textMy_list,"и"));
        System.out.println("Слово мир встречается " + slovo.search(textMy_list,"мир"));
        System.out.println();
        System.out.println("Слово Война встречается " + slovo.search(textMy_list,"Война"));
        System.out.println("Слово И встречается " + slovo.search(textMy_list,"И"));
        System.out.println("Слово Мир встречается " + slovo.search(textMy_list,"Мир"));
        System.out.println();


        System.out.println("Слово В(в)ойна встречается " + (slovo.search(textMy_list,"война") + slovo.search(textMy_list,"Война")) + " раз");
        System.out.println("Слово И(и) встречается " + (slovo.search(textMy_list,"и") + slovo.search(textMy_list,"И")) + " раз");
        System.out.println("Слово М(м)ир встречается " + (slovo.search(textMy_list,"мир") + slovo.search(textMy_list,"Мир")) + " раз");

    }



    public static String readAllBytes() {
        //readAllBytes будет считывать файл с exception. он будет пытаться считать файл
        //обьявляем путь к файлу. он у нас в папке с java файлом, поэтому путь короткий
        String filePath = "D:\\JAVA\\-=Domasnie zadaniya\\DZ5\\src\\edu\\academy\\WarAndPiece.txt";
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;//получаем наш текст в переменной text
    }



}

//    //то же самое - чтение через Scanner - что то не получилось. х
//    public static List<String> ReadFromFile(String filePath) throws FileNotFoundException {
//
//        List<String> text = new ArrayList<>();
//        File file = new File(filePath);
//            try (Scanner s = new Scanner(new FileReader(filePath))) {
//            while (s.hasNext()) {
//                text.add(s.nextLine());
//            }
//            return text;
//        }
////        list.add(line.split(" "));
//        }list.contains()



