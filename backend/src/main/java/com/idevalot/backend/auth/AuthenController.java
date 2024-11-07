package com.idevalot.backend.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenController {
  
  @GetMapping("/basicauth")
  public String basicAuthCheck() {
    return "Success";
  }

}
