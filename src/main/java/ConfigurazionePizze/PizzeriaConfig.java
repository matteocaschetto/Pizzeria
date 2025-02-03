package ConfigurazionePizze;


import EpicPizze.Drink;
import EpicPizze.Menu;
import EpicPizze.Pizza;
import EpicPizze.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class PizzeriaConfig {

    @Bean
    @Scope("prototype")
    public Topping cheese(){
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    @Scope("prototype")
    public Topping ham(){
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    @Scope("prototype")
    public Topping onions(){
        return new Topping("Onions", 0.69, 22);
    }

    @Bean
    @Scope("prototype")
    public Topping pineapple(){
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    @Scope("prototype")
    public Topping salami() {
        return new Topping("Salami", 0.99, 86);
    }

    //Pizza

    @Bean
    @Scope("singleton")
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", Arrays.asList(cheese()), 4.99, 1104);
    }

    @Bean
    @Scope("singleton")
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", Arrays.asList(cheese(), ham(), pineapple()), 6.49, 1024);
    }

    @Bean
    @Scope("singleton")
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", Arrays.asList(cheese(), salami()), 5.99, 1160);
    }

    // Drinks
    @Bean
    @Scope("singleton")
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 1.29, 128);
    }

    @Bean
    @Scope("singleton")
    public Drink water() {
        return new Drink("Water (0.5l)", 1.29, 0);
    }

    @Bean
    @Scope("singleton")
    public Drink wine() {
        return new Drink("Wine (0.75l, 13%)", 7.49, 607);
    }

    // Menu
    @Bean
    @Scope("singleton")
    public Menu menu() {
        return new Menu(Arrays.asList(margherita(), hawaiian(), salamiPizza()), Arrays.asList(lemonade(), water(), wine()) );
    }
}
