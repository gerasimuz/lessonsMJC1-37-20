package edu.academy;

import java.util.ArrayList;

public class EasySearch implements ISearchEngine{

    @Override
    public int search(ArrayList<String> text, String word) {
        int count = 0;

        for (String ss: text) {
            if (ss.equals(word))//equals , contains,
            count++;
        }
       return count;
    }

}

