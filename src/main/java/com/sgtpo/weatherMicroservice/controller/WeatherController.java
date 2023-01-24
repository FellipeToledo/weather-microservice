package com.sgtpo.weatherMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

  @GetMapping("/weather")
  public String test(){
    return "Weather up";
  }

}
