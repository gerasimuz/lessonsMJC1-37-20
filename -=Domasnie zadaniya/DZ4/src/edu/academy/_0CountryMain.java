package edu.academy;

import java.util.ArrayList;
import java.util.Arrays;

import static edu.academy._0Country.*;

public class _0CountryMain {

    public static void main(String[] args) {
    _0Country country = _0Country.BELARUS;
        System.out.println("площадь страны " + country.name() +" "+country.getArea());
        System.out.println("население страны " + country.name() +" "+country.getPopulation());

        System.out.println(_0Country.BELARUS);

        System.out.println("население 2 стран");
        _0Country country1 = _0Country.IRAK;
        _0Country country2 = _0Country.BELARUS;
        System.out.println("население 2 стран " + (country1.getPopulation() + country2.getPopulation()));
        System.out.println("площадь 2 стран " + (country1.getArea() + country2.getArea()));

        _0Country country3 = _0Country.valueOf("UK");
        System.out.println(country3);
        _0Country country4 = _0Country.valueOf("BELARUS");
        if(country3 == country4)
            System.out.println("значения стран равны");
            else System.out.println("значения стран не равны");//получаем что valueOf копирует в новую переменную значение старой

//        Country country5 = Country.valueOf("SWEDEN");
//        System.out.println(country5.toString());//java.lang.IllegalArgumentException: No enum constant edu.academy.Country.SWEDEN
        //ошибка - не является константой enum

        System.out.println(country3.name());//enum.name - выводит значение константы (ее имя)
        System.out.println(country2.ordinal());//выводит порядковый номер требуемой константы в массиве констант enum
        System.out.println(_0Country.BELARUS.ordinal());//можно и так
        boolean isEqualToItself = _0Country.BELARUS.equals(country2);//значение равно когда обьекты ссылаются на один обьект в памяти
        System.out.println(isEqualToItself);
        System.out.println(_0Country.BELARUS.hashCode());
        //values - позволяет получить массив элементов из enum

        _0Country[] count= _0Country.values();
        System.out.println(Arrays.toString(count));
        //занесем наши страны в arraylist Country

                ArrayList<_0Country> dat = new ArrayList<_0Country>();

        dat.add(_0Country.FRANCE);
        dat.add(_0Country.UKRAINE);
        dat.add(_0Country.BELARUS);
        dat.add(_0Country.IRAN);
        dat.add(_0Country.IRAK);
        dat.add(_0Country.ITALY);
        dat.add(_0Country.POLAND);
        dat.add(_0Country.RUSSIA);
        dat.add(UK);
        dat.add(_0Country.USA);

        //выведем arraylist data до сортировки
        System.out.println("unsorted: ");
        for (_0Country c:dat){
            System.out.println(c.name()+" "+c);
        }

        //сортировка
        _0CountryAreaComparator sravnenie = new _0CountryAreaComparator();
        dat.sort(sravnenie);

        System.out.println("Sorted: ");
        for (_0Country h: dat) {
            System.out.println(h.name()+ " " + h);
        }

    }
}

