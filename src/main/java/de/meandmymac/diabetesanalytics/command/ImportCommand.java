package de.meandmymac.diabetesanalytics.command;

import java.util.concurrent.Callable;
import de.meandmymac.diabetesanalytics.DiabetesAnalyticsApplication;
import lombok.Getter;
import picocli.CommandLine;

@CommandLine.Command(
    name = "import",
    description = "Import files with data",
    mixinStandardHelpOptions = true)
public class ImportCommand implements Runnable {
  @CommandLine.ParentCommand
  private DiabetesAnalyticsApplication applicationCommand;

  @CommandLine.Option(
      names = { "-i", "--import-file" },
      description = "Path to the MS Excel or CSV file",
      paramLabel = "FILEPATH",
      required = true)
  @Getter
  private String filepath;

  @CommandLine.Option(
      names = { "-m", "--attribute-mapping" },
      description = "JSON file that contains the mapping between the cells and the attributes",
      paramLabel = "ATTRIBUTE-MAPPING-FILEPATH")
  @Getter
  private String attributeMappingFilepath;

  @Override
  public void run() {
  }
}
