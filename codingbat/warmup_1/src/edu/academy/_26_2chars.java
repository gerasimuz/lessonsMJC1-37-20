package edu.academy;

public class _26_2chars {
    public String text (String text){
        if (text.length()<=2) return text+text+text;
        else {
            String first = text.substring(0, 2);
            return first+text+first;
        }
    }
}
