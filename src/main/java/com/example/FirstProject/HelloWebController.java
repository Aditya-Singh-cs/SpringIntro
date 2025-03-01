package com.example.FirstProject;

//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Newer Version need to use this
public class HelloWebController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from BridgeLabz";
    }

}
