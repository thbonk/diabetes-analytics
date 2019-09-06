package de.meandmymac.diabetesanalytics.command;

import java.util.concurrent.Callable;
import picocli.CommandLine;

@CommandLine.Command(
    name = "import",
    description = "Import files with data",
    mixinStandardHelpOptions = true)
public class ImportCommand implements Runnable {

  @Override
  public void run() {

  }
}
