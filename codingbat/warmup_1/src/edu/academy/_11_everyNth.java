package edu.academy;

public class _11_everyNth {
    public String everyNth (String text, int N){
        String newText="";
        for (int i = 0; i < text.length(); i=i+N) {
        newText = newText + text.charAt(i);
        }
        return newText;
    }

}
