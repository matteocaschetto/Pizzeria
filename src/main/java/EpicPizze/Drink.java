package EpicPizze;

public class Drink {

    private String name;
    private double price;
    private int calorie;

    public Drink() {
    }

    public Drink(String name, double price, int calorie) {
        this.name = name;
        this.price = price;
        this.calorie = calorie;
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

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calorie=" + calorie +
                '}';
    }
}
