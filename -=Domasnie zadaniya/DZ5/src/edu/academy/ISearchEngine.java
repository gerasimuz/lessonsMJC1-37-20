package edu.academy;

import java.util.ArrayList;

@FunctionalInterface
public interface ISearchEngine {
    int search(ArrayList<String> text, String word);
}
