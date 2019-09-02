package de.meandmymac.diabetesanalytics.backend.web.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Controller that forwards the browser to the UI.
 */
@Controller
@RequestMapping("/")
public class UiController {
  /**
   * Forward the browser to the UI.
   *
   * @return the string
   */
  @GetMapping
  public String frontendForward() {
    return "forward:/ui/index.html";
  }
}
