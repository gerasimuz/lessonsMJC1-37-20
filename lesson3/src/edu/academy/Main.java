package edu.academy;

public class Main {

    public static void main(String[] args) {

        People Alex = new People(12,170);
        People Sam = new People(7,190, "Петя");
        People John = new People ("Ваня");

        System.out.println(Alex.age + " "+ Alex.rost + " " + Alex.name);
        System.out.println(Sam.age + " "+ Sam.rost + " " + Sam.name);
        System.out.println(John.age + " "+ John.rost + " " + John.name);
        }

public class People{
    int age;
    int rost;
    String name;
}
    public People(){
        age = 0;
        rost = 0;
        name = "default";
    }
    public People(String z) {
        age = 0;
        rost = 0;
        name = z;
    }
    public People(int x, int y){
        age = x;
        rost = y;
        name = "default";
    }
    public People(int x, int y, String z) {
        age = 0;
        rost = 0;
        name = z;
    }

}

}
