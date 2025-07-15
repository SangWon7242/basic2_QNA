package com.sbs.basic2.boundedContext.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping("/main")
  @ResponseBody
  public String showMainPage() {
    return "메인페이지";
  }
}
