package edu.academy;

public class Color {

    //константы приватные.
    // методы публичные.
    // конструктор публичный.
    // без статик методов

    private final int Red = 1;
    private final int Orange = 2;
    private final int Yellow = 3;
    private final int Green = 4;
    private final int Blue = 5;
    private final int Darkblue = 6;
    private final int Purple = 7;


    protected String[] days = new String[]{"RED", "ORANGE","YELLOW", "GREEN", "BLUE", "DARKBLUE", "PURPLE"};
    int number = 0;

    public Color (int number){
    this.number=number;
    }

    public void getNumber(){
        System.out.println(number);
    }

    public void getName() {
        System.out.println(days[number-1]);//можно через массив
        //можно как в задании
        String name;
        switch (number){
            case Red:
            name = "красный";
            break;

            case Orange:
                name = "Оранжевый";
                break;

            case Yellow:
                name = "оранжевый";
                break;

            case Green:
                name = "зеленый";
                break;
            case Blue:
                name = "голубой";
                break;
            case Darkblue:
                name = "синий";
                break;
            case Purple:
                name = "фиолетовый";
                break;
            default:
                 name = "это не цвет радуги";
                break;
        }
    }

//        }
    }

