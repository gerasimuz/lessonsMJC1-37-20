package edu.academy;

import java.util.Arrays;

public class DataContainer<E> {
    private E[] data;
    int k=0;
    public DataContainer(int initCapacity){
        this.data = (E[]) new Integer[initCapacity];
    }


    public E[] getData() {
        return data;
    }

    public void add(E data){
        for (int i = 0; i <this.data.length ; i++) {
            if (this.data[i] == null) {
                this.data[i] = data;
                return;
            }
        }
            this.data = Arrays.copyOf(this.data,this.data.length + 1);
            this.data[this.data.length-1] = data;
    }
}
