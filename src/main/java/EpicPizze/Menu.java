package EpicPizze;

import java.util.List;

public class Menu {

    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public Menu() {
    }

    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;

    }


    public void printMenu() {
        System.out.println("===== PIZZERIA MENU =====\n");

        System.out.println("Pizzas:");
        pizzas.forEach(System.out::println);

        System.out.println("\nToppings:");
        drinks.forEach(System.out::println);

        System.out.println("\nDrinks:");
        drinks.forEach(System.out::println);
    }
}
