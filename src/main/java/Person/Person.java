package Person;

public class Person {

    private String name;
    private int age;
    private int height;
    private double money;

    public Person(String name, int age, int height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void pay(double money){
//        if statement for checking money already in ride logic. unsure if this is bad
        this.money -= money;
    }

}
