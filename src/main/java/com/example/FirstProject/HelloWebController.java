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

//    This method handles HTTP GET requests for the "/hello/param/{name}" endpoint.
//    It takes a dynamic value from the URL path using @PathVariable and returns a greeting message.

    //    http://localhost:8080/hello/param/Aditya
    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name + " from BridgeLabz";
    }

    // Extracts firstName and lastName from the request body and returns a greeting message
//    http://localhost:8080/hello/post
    @PostMapping("/hello/post")
    public String hello(@RequestBody User user){
        return "Hello " + user.getFirstName()+" "+user.getLastName() + " from BridgeLabz";
    }

    // Handles HTTP PUT requests to "/hello/put/{firstName}"
//    http://localhost:8080/hello/put/Aditya?lastName=Singh
    @PutMapping("/hello/put/{firstName}")
    public String hello(@PathVariable String firstName,@RequestParam(value = "lastName")String lastName){
        return "Hello " + firstName+" "+lastName + " from BridgeLabz";
    }
}
