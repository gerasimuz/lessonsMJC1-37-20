package edu.academy;

public class _28_del {
    public String stroka (String text){
        String ss;
        if (text.substring(1,4).equals("del")){
            ss = text.charAt(0)+text.substring(4,text.length());
        } else ss = text.substring(0,text.length());
        return ss;
    }
}
