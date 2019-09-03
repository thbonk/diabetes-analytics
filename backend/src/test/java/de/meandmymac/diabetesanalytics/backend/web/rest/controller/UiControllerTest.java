package de.meandmymac.diabetesanalytics.backend.web.rest.controller;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UiControllerTest {
  @Autowired
  private UiController uiController;

  @Test
  public void frontend_forward_successful() {
    assertThat(uiController.frontendForward())
        .isEqualTo("forward:/ui/index.html");
  }
}
