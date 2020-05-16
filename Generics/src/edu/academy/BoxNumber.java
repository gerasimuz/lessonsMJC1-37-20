package edu.academy;

public class BoxNumber <T extends Number>{
    private T item;

    public Double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
