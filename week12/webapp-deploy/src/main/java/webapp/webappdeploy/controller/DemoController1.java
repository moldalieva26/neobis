package webapp.webappdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class DemoController1 {
      
      @GetMapping
      public String check() {
           return "Application is alive";
      }
}