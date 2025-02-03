package com.model.Pizzeria;

import EpicPizze.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurazionePizze.PizzeriaConfig.class);



		Menu menu = context.getBean(Menu.class);
		menu.printMenu();
	}

}
