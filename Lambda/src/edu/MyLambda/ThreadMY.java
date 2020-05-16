package edu.MyLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadMY {
    public static void main(String[] args) {
        new Worker().main();
    }

}

class Worker{
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    Random rnd = new Random();

    public void addList1() {
        synchronized (list1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(rnd.nextInt(100));
        }
    }

    public void addList2() {
        synchronized (list2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(rnd.nextInt(100));
        }
    }
    public void work(){
        for (int i = 0; i < 1000 ; i++) {
            addList1();
            addList2();
        }
    }

    public void main(){
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
            thread1.start();
            thread2.start();
        long after = System.currentTimeMillis();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println("time of making is  " + (after-before));
    }
}

