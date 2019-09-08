package de.meandmymac.diabetesanalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The class with the entry point of the application.
 */
@SpringBootApplication
public class DiabetesAnalyticsApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System
                .exit(
                        SpringApplication
                                .exit(
                                        SpringApplication
                                                .run(DiabetesAnalyticsApplication.class, args)));
    }
}
