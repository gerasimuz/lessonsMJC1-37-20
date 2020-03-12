package edu.academy;

// в этом классе происходит рост мальчика. описана переменная - его рост. и процент прироста в год.

public class Boy {
    int rost = 50;
   int prirost=15;//на сколько увеличивается рост в год

    //создаем метод роста
    public int grow(int a){   // a- возраст мальчика
      rost = rost + a*prirost; //можно rost += a*prirost
                return rost;
    }
 }
