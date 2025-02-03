package EpicPizze;

import java.util.List;

public class Pizza {

    private String name;
    private List<Topping> toppings;
    private double price;
    private int calorie;

    public Pizza() {
    }

    public Pizza(String name, List<Topping> toppings, double price, int calorie) {
        this.name = name;
        this.toppings = toppings;
        this.price = price;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                ", price=" + price +
                ", calorie=" + calorie +
                '}';
    }
}
