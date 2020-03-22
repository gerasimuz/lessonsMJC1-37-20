package edu.academy;

public class _24_notBegin {
    public String not(String text){
        String newText = "not ";
        if (text.length()<3) return newText + text;
        else if (text.substring(0,4).equals(newText)) {
            return text;
        }
        else return newText + text;
        }
    }

