package de.meandmymac.diabetesanalytics;

import de.meandmymac.diabetesanalytics.command.DiabetesAnalyticsCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

/**
 * This class implemments the runner for the application.
 */
@Component
public class DiabetesAnalyticsRunner implements CommandLineRunner, ExitCodeGenerator {
    private final CommandLine.IFactory factory;
    private final DiabetesAnalyticsCommand mainCommand;

    private int exitCode = 0;

    /**
     * Instantiates a new DiabetesAnalyticRunner.
     *
     * @param factory     the factory
     * @param mainCommand the main command
     */
    @Autowired
    public DiabetesAnalyticsRunner(CommandLine.IFactory factory, DiabetesAnalyticsCommand mainCommand) {
        this.factory = factory;
        this.mainCommand = mainCommand;
    }

    @Override
    public void run(String... args) throws Exception {
        CommandLine commandLine = new CommandLine(mainCommand, factory);

        if (args.length == 0) {
            commandLine.usage(System.err);
            exitCode = 128;
        } else {
            exitCode = commandLine.execute(args);
        }
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }
}
