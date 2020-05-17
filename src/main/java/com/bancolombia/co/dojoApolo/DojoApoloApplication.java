package com.bancolombia.co.dojoApolo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DojoApoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoApoloApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(VariablesMap vMap){
		return evnt -> {
			System.out.println(vMap.getName());
			System.out.println(vMap.getAge());
		};
	}

}
