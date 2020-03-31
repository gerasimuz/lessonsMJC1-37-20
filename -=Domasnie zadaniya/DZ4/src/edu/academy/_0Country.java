package edu.academy;

public enum _0Country implements _0GetCountry {
    BELARUS(9000,8700),
    FRANCE(1000,1100),
    IRAK(2000,4600),
    IRAN(7500,9000),
    ITALY(6000,7000),
    POLAND(11000,9500),
    RUSSIA(8500,7500),
    UK(10000,9000),
    UKRAINE(7200,8600),
    USA(9000,10000);

    private int population;
    private int area;

    _0Country(int population, int area) {
        this.population = population;
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public String toString() {
        return "Country{" +
                "population=" + population +
                ", area=" + area +
                '}';
    }


}
