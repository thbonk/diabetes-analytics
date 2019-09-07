package de.meandmymac.diabetesanalytics.command;

import lombok.Getter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

/**
 * The class with the entry point of the application.
 */
@SpringBootApplication
@Command(
    name = "diabetes-analytics",
    description = "Analytics for Diabetes Type-1 data",
    subcommands = { ImportCommand.class },
    mixinStandardHelpOptions = true,
    version = "diabetes-analytics 0.0.1",
    exitCodeOnExecutionException = 128)
public class DiabetesAnalyticsCommand implements Runnable {

  @Option(
      names = {"-v", "--verbose"},
      description = "Be verbose")
  @Getter
  private Boolean verbose = false;

  @Override
  public void run() {
  }
}
