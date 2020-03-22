package edu.academy;

public class _5_backAround {
    public String back(String text){
      //  String bb = text.substring(text.length()-1); можно так можно через charAt
        char bbb = text.charAt(text.length()-1);
        return (bbb+text+bbb);
    }
}
