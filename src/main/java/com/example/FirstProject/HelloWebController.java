package com.example.FirstProject;

//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController //Newer Version need to use this
public class HelloWebController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from BridgeLabz";
    }


//    This method handles HTTP GET requests for the "/query" endpoint.
//     It expects a request parameter named "name" and returns a greeting message.
    //    http://localhost:8080/hello/query?name=Aditya

    @RequestMapping(value = {"/hello/query"},method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name")String name){
        return "Hello " + name + " from BridgeLabz";
    }

}
