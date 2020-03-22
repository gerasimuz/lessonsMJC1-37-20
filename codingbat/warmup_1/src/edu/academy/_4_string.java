package edu.academy;

public class _4_string {
    public String car(String text, int n){
        if (n >= 0 && n< text.length()){
            return (text.substring(0,n)+text.substring(n+1));
        }else {
            System.out.println("вы за пределами длины строки");
            return  text;
        }
    }
}
