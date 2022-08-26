package com.itj.cicddemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/greetings")
  public String greetings() {
    return "Hi, good evening"
  }

}
