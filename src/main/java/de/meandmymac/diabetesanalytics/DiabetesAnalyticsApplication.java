package de.meandmymac.diabetesanalytics;

import java.util.concurrent.Callable;
import de.meandmymac.diabetesanalytics.command.ImportCommand;
import lombok.Getter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;

/**
 * The class with the entry point of the application.
 */
@SpringBootApplication
@CommandLine.Command(
    name = "diabetes-analytics",
    description = "Analytics for Diabetes Type-1 data",
    subcommands = { ImportCommand.class },
    mixinStandardHelpOptions = true,
    version = "diabetes-analytics 0.0.1")
public class DiabetesAnalyticsApplication implements CommandLineRunner, Callable<Integer> {

  @CommandLine.Option(
      names = {"-v", "--verbose"},
      description = "Be verbose")
  @Getter
  private Boolean verbose = false;
  private CommandLine commandLine;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SpringApplication
      .exit(
          SpringApplication
              .run(DiabetesAnalyticsApplication.class, args));
  }

  @Override
  public void run(String... args) {
    commandLine = new CommandLine(this);
    commandLine.execute(args);
  }

  @Override
  public Integer call() {
    commandLine.usage(System.err);
    return 0;
  }
}
