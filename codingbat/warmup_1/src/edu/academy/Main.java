package edu.academy;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //первый пример- про сон
        System.out.println("1 пример");
        _1_SleepIn weSleep = new _1_SleepIn();
        System.out.println(weSleep.sleepIn(false, false));
        System.out.println(weSleep.sleepIn(true, false));
        System.out.println(weSleep.sleepIn(false, true));

        //второй пример
        System.out.println("2 пример");
        _2_minus21 difference = new _2_minus21();
        System.out.println(difference.minus(19));
        System.out.println(difference.minus(10));
        System.out.println(difference.minus(21));
        System.out.println(difference.minus(28));

        //третий пример
        System.out.println("3 пример");
        _3_nearHundred par = new _3_nearHundred();
        System.out.println(par.near(93));
        System.out.println(par.near(90));
        System.out.println(par.near(89));
        System.out.println(par.near(193));

        //4 пример
        System.out.println("4 пример");
        _4_string Stroka = new _4_string();
        System.out.println(Stroka.car("kitten",1));
        System.out.println(Stroka.car("kitten",0));
        System.out.println(Stroka.car("kitten",4));
        System.out.println(Stroka.car("kitten",15));

        //5 пример
        System.out.println("5 пример");
        _5_backAround back = new _5_backAround();
        System.out.println(back.back("cat"));
        System.out.println(back.back("hello"));
        System.out.println(back.back("a"));
        System.out.println(back.back("вроде работаеТ"));

        //6 пример с hi
        System.out.println("6 пример");
        _6_hi hay = new _6_hi();
        System.out.println(hay.hi("hi there"));
        System.out.println(hay.hi("hi"));
        System.out.println(hay.hi("hello hi"));

        //7 пример hasTeen
        System.out.println("7 пример");
        _7_HasTeen hasTeen = new _7_HasTeen();
        System.out.println(hasTeen.hasTeen(13,20,10));
        System.out.println(hasTeen.hasTeen(20,19,10));
        System.out.println(hasTeen.hasTeen(20,10,13));
        System.out.println(hasTeen.hasTeen(12,21,-2));//свой пример все 3 не в диапазоне

        //8 пример с ix
        System.out.println("8 пример");
        _8_mixStart ix = new _8_mixStart();
        System.out.println(ix.TwoThree("mix snacks"));
        System.out.println(ix.TwoThree("pix snacks"));
        System.out.println(ix.TwoThree("piz snacks"));
        System.out.println(ix.TwoThree("7iz sacks"));

        //9 пример - ближайшее к 10
        System.out.println("9 пример - ближайшее к 10");
        _9_nearTo10 near = new _9_nearTo10();
        System.out.println(near.nearTo(8,13));
        System.out.println(near.nearTo(13,8));
        System.out.println(near.nearTo(13,7));
        System.out.println(near.nearTo(-20,21));//мой пример с отриц числом

        //10 пример - е в диапазоне 1-3
        System.out.println("10 пример - е в диапазоне 1-3");
        _10_eee e3 = new _10_eee();
        System.out.println(e3.eee("Hello"));
        System.out.println(e3.eee("Heelle"));
        System.out.println(e3.eee("Heelele"));

        //11 пример - меняем каждый N символ
        _11_everyNth nnn = new _11_everyNth();
        System.out.println("11 пример - меняем каждый N символ3");
        System.out.println(nnn.everyNth("Miracle",2));
        System.out.println(nnn.everyNth("abcdefg",2));
        System.out.println(nnn.everyNth("abcdefg",3));
        System.out.println(nnn.everyNth("русский текст",1));

        //12 пример - 2 обезьянки
        System.out.println("12 пример - 2 обезьянки");
        _12_monkeys monk = new _12_monkeys();
        System.out.println(monk.monkeySmike(true, true));
        System.out.println(monk.monkeySmike(false, false));
        System.out.println(monk.monkeySmike(true, false));

        //13 пример - попугай
        System.out.println("13 пример - попугай");
        _13_inTouble pop = new _13_inTouble();
        System.out.println(pop.inTrouble(true,6));
        System.out.println(pop.inTrouble(true,7));
        System.out.println(pop.inTrouble(false,6));

        //14 пример - два числа
        System.out.println("2 числа");
        _14_negPos liter2 = new _14_negPos();
        System.out.println(liter2.negPos(1, -1, false));
        System.out.println(liter2.negPos(-1, 1, false));
        System.out.println(liter2.negPos(-4, -5, true));

        //15 меняем местами первое и последнее
        _15_firstToLast tex = new _15_firstToLast();
        System.out.println("15 - меняем местами первое и последнее");
        System.out.println(tex.stroka("code"));
        System.out.println(tex.stroka("a"));
        System.out.println(tex.stroka("ab"));
        System.out.println(tex.stroka("топчик"));

        //16 делим на 3 и 5 без остатка
        System.out.println("16 пример - делится ли данное число на 3 или 5 без остатка");
        _16_ampersant35 n35 = new _16_ampersant35();
        System.out.println(n35.amper(3));
        System.out.println(n35.amper(10));
        System.out.println(n35.amper(8));

        //17 - меньше 0 и больше 100
        System.out.println("17 - меньше 0 и больше 100");
        _17_less0more100 temp = new _17_less0more100();
        System.out.println(temp.icyHot(120,-1));
        System.out.println(temp.icyHot(-1,120));
        System.out.println(temp.icyHot(2,120));
        System.out.println(temp.icyHot(120,-10));

        //18 - только 1 в диапазоне 13..19
        System.out.println("18 - только 1 в диапазоне 13..19");
        _18_teen13_19 teen = new _18_teen13_19();
        System.out.println(teen.teen(13,99));
        System.out.println(teen.teen(21,19));
        System.out.println(teen.teen(13,13));

        //19 - oz в начале
        System.out.println("19 - oz в начале");
        _19_oz text = new _19_oz();
        System.out.println(text.oz("ozymandias"));
        System.out.println(text.oz("bzoo"));
        System.out.println(text.oz("oxx"));
        System.out.println(text.oz("o"));

        //20 - 30-40 или 40-50
        System.out.println(" 30-40 или 40-50");
        _20_in3050 ch = new _20_in3050();
        System.out.println(ch.in(30,31));
        System.out.println(ch.in(30,41));
        System.out.println(ch.in(40,50));

        //21 задание - сравниваем последнюю цифру
        System.out.println("21 задание - сравниваем последнюю цифру");
        _21_mod10 stre = new _21_mod10();
        System.out.println(stre.mod(7,17));
        System.out.println(stre.mod(6,17));
        System.out.println(stre.mod(3,113));

        //22 задание - сумма 2 чисел
        System.out.println("22 задание - сумма 2 чисел");
        _22_sum summ = new _22_sum();
        System.out.println(summ.sum(1,2));
        System.out.println(summ.sum(3,2));
        System.out.println(summ.sum(2,2));

        //23 задание - число или сумма = 10
        System.out.println("23 задание - число или сумма = 10");
        _23_sum10 ss = new _23_sum10();
        System.out.println(ss.summ(9,10));
        System.out.println(ss.summ(9,9));
        System.out.println(ss.summ(1,9));

        //24 задание - not  в начало
        System.out.println("24 задание - not  в начало");
        _24_notBegin not = new _24_notBegin();
        System.out.println(not.not("candy"));
        System.out.println(not.not("x"));
        System.out.println(not.not("not bad"));

        //25 задание - повторить первые 3 буквы 3 раза
        System.out.println("25 задание - повторить первые 3 буквы 3 раза");
        _25_3times stri = new _25_3times();
        System.out.println(stri.sss("Java"));
        System.out.println(stri.sss("Chocolate"));
        System.out.println(stri.sss("abc"));
        System.out.println(stri.sss("ab"));//пример меньше 3 букв

        //26 задание - повторить первые 3 буквы 3 раза
        System.out.println("25 задание - повторить первые 3 буквы 3 раза");
        _26_2chars chars = new _26_2chars();
        System.out.println(chars.text("kitten"));
        System.out.println(chars.text("Ha"));
        System.out.println(chars.text("abc"));

        //27 задание - оба числа в диапазоне 10..20
        System.out.println("27 задание - оба числа в диапазоне 10..20");
        _27_10_20 chisla = new _27_10_20();
        System.out.println(chisla.lit(12,99));
        System.out.println(chisla.lit(21,12));
        System.out.println(chisla.lit(8,99));

        //28 задание - удалить del
        System.out.println("28 задание - удалить del");
        _28_del del = new _28_del();
        System.out.println(del.stroka("adelbc"));
        System.out.println(del.stroka("adelHello"));
        System.out.println(del.stroka("adedbc"));

        //29 максимальное из 3
        System.out.println("29 максимальное из 3");
        _29_largest max = new _29_largest();
        System.out.println(max.large(1,2,3));
        System.out.println(max.large(1,3,2));
        System.out.println(max.large(3,2,1));

        //30 максимальное из диапазона 10..20
        System.out.println("30 максимальное из диапазона 10..20");
        _30_max1020 maxx = new _30_max1020();
        System.out.println(maxx.lit(11,19));
        System.out.println(maxx.lit(19,11));
        System.out.println(maxx.lit(11,9));

        //31 - последние 3 буквы в верхнем регистре
        System.out.println("31 - последние 3 буквы в верхнем регистре");
        _31_upper str = new _31_upper();
        System.out.println(str.text("Hello"));
        System.out.println(str.text("hi there"));
        System.out.println(str.text("hi"));
    }
}
