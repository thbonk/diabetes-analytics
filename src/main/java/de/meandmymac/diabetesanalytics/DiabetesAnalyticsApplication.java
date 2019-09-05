package de.meandmymac.diabetesanalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiabetesAnalyticsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DiabetesAnalyticsApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}
}
