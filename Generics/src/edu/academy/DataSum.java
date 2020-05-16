package edu.academy;

public class DataSum {
    public static Long sum(DataContainer<? extends Number> data) {
        Long result = 0l;
        for (Number datum : data.getData()) {
            if (datum != 0) {
                result += datum;
            }
        }
        return result;
    }
}
