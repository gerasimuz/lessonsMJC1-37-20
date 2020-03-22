package edu.academy;

public class _8_mixStart {
    public boolean TwoThree(String text){
        String first2char = text.substring(1,3);
        if (first2char.equals("ix")) return true;
        else return false;
    }
}
