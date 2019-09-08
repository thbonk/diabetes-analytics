package de.meandmymac.diabetesanalytics.command;

import lombok.Getter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

/**
 * The class with the entry point of the application.
 */
@SpringBootApplication
@Command(
        name = "diabetes-analytics",
        description = "Analytics for Diabetes Type-1 data",
        subcommands = {ImportCommand.class},
        mixinStandardHelpOptions = true,
        version = "diabetes-analytics 0.0.1",
        exitCodeOnExecutionException = 128)
public class DiabetesAnalyticsCommand implements Runnable, CommandLine.IExitCodeGenerator {

    private int exitCode = 0;

    @Option(
            names = {"-v", "--verbose"},
            description = "Be verbose",
            defaultValue = "false",
            showDefaultValue = CommandLine.Help.Visibility.ALWAYS)
    @Getter
    private Boolean verbose = false;

    @Override
    public void run() {
        exitCode = CommandLine.ExitCode.USAGE;
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }
}
