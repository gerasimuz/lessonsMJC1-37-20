package edu.academy;

public class Animal implements Comparable {

    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    Animal(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

     public String toString() {
        return ("Breed " + breed + ", weight " + weight + ", speed = "+ speed +", price = "+ price);

    }

    @Override
    public int compareTo (Object o){
        int tmp = this.speed - ((Animal)o).speed;
        if (tmp ==0) return this.price -((Animal)o).price;
        else return tmp;

    }

}
