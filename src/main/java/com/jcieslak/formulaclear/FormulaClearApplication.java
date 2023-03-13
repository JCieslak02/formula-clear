package com.jcieslak.formulaclear;

import com.jcieslak.formulaclear.service.RaceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FormulaClearApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormulaClearApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RaceService raceService) {
		return args -> {
			raceService.calculateAllRacesClassified();
		};
	}

}
