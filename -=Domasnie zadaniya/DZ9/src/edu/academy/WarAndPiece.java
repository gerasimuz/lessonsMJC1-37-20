package edu.academy;

    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Paths;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

public class WarAndPiece {
    public static void main(String[] args) {

        String filePath = "D:\\JAVA\\-=Domasnie zadaniya\\DZ9\\src\\edu\\academy\\WarAndPiece.txt";

        String textMy = "";
        try {
            textMy = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //разбиваем массив на слова

        String[] words = textMy.toLowerCase().replace(",", "").replace(".", "").replace("--", "").split("\\s*(\\s|,|!|\\.)\\s*");

        //наш искомый шаблон для поиска -
        Pattern pattern = Pattern.compile("((М|м)ир)|((В|в)ойна)");
        int count=0;
        for (String w : words) {

            Matcher matcher = pattern.matcher(w);
            boolean matches = matcher.find();

            if (matches) {
                count++;
            }

        }
        System.out.println("Искомый запрос \"" + pattern.toString() + "\" встречается " + count + " раз");
    }
}