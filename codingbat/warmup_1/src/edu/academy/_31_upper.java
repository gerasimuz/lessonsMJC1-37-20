package edu.academy;

public class _31_upper {
    public String text (String text){
        if (text.length()<3) return text.toUpperCase();
        else {
            String ss = text.substring(text.length()-3,text.length());
            return text.substring(0,text.length()-3)+ ss.toUpperCase();
        }
    }
}
