package edu.academy;

public class _15_firstToLast {
    public String stroka (String text) {
        if (text.length() <= 1) return text;
        else {

            char sLast = text.charAt(text.length() - 1);
            char sFirst = text.charAt(0);
            return (sLast + text.substring(1, text.length()-1) + sFirst);
        }
    }

}
