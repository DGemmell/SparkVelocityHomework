package models;

public class RandomNames {

    private String name1;
    private String name2;

    public RandomNames(String name1, String name2) {
        this.name1 = name1;
        this.name2= name2;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String add() {
        return name1 + name2;
    }








}
