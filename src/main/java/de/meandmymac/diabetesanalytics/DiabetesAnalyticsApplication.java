package de.meandmymac.diabetesanalytics;

import java.util.concurrent.Callable;
import de.meandmymac.diabetesanalytics.command.ImportCommand;
import lombok.Getter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

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
