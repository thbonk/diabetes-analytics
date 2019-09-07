package de.meandmymac.diabetesanalytics.command;

import java.util.concurrent.Callable;
import de.meandmymac.diabetesanalytics.DiabetesAnalyticsApplication;
import lombok.Getter;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

/**
 * This class implements the command 'import'.
 */
@Component
@Command(
    name = "import",
    description = "Import files with data",
    mixinStandardHelpOptions = true,
    exitCodeOnExecutionException = 128)
public class ImportCommand implements Runnable {
  @ParentCommand
  private DiabetesAnalyticsCommand applicationCommand;

  @Option(
      names = { "-i", "--import-file" },
      description = "Path to the MS Excel or CSV file",
      paramLabel = "FILEPATH",
      required = true)
  @Getter
  private String filepath;

  @Option(
      names = { "-m", "--attribute-mapping" },
      description = "JSON file that contains the mapping between the cells and the attributes",
      paramLabel = "ATTRIBUTE-MAPPING-FILEPATH")
  @Getter
  private String attributeMappingFilepath;

  @Override
  public void run() {
  }
}
