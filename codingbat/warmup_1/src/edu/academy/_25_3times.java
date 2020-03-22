package edu.academy;

public class _25_3times {
    public String sss (String text){
        if (text.length()>=3){
            String ttt = text.substring(0,3);
            return  ttt+ttt+ttt;
        } else return text;
    }
}
