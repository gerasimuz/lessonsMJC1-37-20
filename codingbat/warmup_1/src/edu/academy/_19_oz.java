package edu.academy;

public class _19_oz {
    public String oz(String text){
        if (text.length()>2) {
            String itog = "";
            char c0 = text.charAt(0);
            char c1 = text.charAt(1);
            if (text.charAt(0) == 'o')
                itog = itog + text.charAt(0);
            if (text.charAt(1) == 'z')
                itog = itog + text.charAt(1);
            return itog;
        }else return text;
    }
}
