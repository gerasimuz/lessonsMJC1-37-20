package edu.academy;

public class Sortir {
    public static void main(String[] args) {

        //concat- обьединение строк ("первая строка %s", что будем вставлять вместе %s)
        String str = "Виталий";
        String s= "я изучаю java";
        System.out.println(String.format("Привет %s, как дела",str));

        //метод .trim - удаляет начальные и конечные пробелы
        String spacedString ="       много  текста     с пробелами";
        String inn = spacedString.trim();
        System.out.println(inn);
        System.out.println(spacedString);

        //concat -конкантинация - обьединяет строки

        String sss= spacedString.concat("алло.");
        System.out.println(sss);

    }



}
