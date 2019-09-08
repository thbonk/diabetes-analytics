package de.meandmymac.diabetesanalytics.command;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import picocli.CommandLine;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiabetesAnalyticsCommandTest {
    @Autowired
    private DiabetesAnalyticsCommand command;

    @Test
    public void if_no_parameters_are_given_then_verbose_is_false() {
        String[] args = {};

        new CommandLine(command).parseArgs(args);

        assertThat(command.getVerbose())
                .isFalse();
    }

    @Test
    public void if_short_vorbose_flag_is_set_then_verbose_is_true() {
        String[] args = {"-v"};

        new CommandLine(command).parseArgs(args); //.execute(args);

        assertThat(command.getVerbose())
                .isTrue();
    }

    @Test
    public void if_long_vorbose_flag_is_set_then_verbose_is_true() {
        String[] args = {"--verbose"};

        new CommandLine(command).parseArgs(args);

        assertThat(command.getVerbose())
                .isTrue();
    }

    @Test
    public void executing_main_command_returns_0() {
        String[] args = {};
        int returnCode = new CommandLine(command).execute(args);

        assertThat(returnCode)
                .isEqualTo(CommandLine.ExitCode.USAGE);
    }
}
