package Rides;

import Person.Person;

public abstract class Ride implements IRide {

    private String name;
    private double price;
    private int minHeight;

    public Ride(String name, double price, int minHeight) {
        this.name = name;
        this.price = price;
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public boolean isTallEnough(Person person){
        return (person.getHeight() >= minHeight);
    }

    public boolean hasEnoughMoney(Person person){
        return (person.getMoney() >= price);
    }

}
