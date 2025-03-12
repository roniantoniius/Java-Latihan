package com.roniantonius.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roniantonius.starter.config.PizzaConfig;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class StarterApplication implements CommandLineRunner{
	
	private PizzaConfig pizzaConfig;
	
	public StarterApplication(PizzaConfig pizzaConfig) {
		this.pizzaConfig = pizzaConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub		
		log.info(
				String.format("Aku pengen pizza rasa %s dengan topping %s dan tipe %s ya",
				pizzaConfig.getSauce(),
				pizzaConfig.getToping(),
				pizzaConfig.getCrust()
				));
	}
	
	

}
