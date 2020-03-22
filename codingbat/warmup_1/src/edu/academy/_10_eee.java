package edu.academy;

public class _10_eee {
    public boolean eee(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'e'){
                count++;
            }
        }
        if (count>=1 && count <=3) return true;
        else return false;
    }
}
