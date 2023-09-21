package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    // Handles requests at path /hello
    @GetMapping("hello")
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hola")
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";

    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //Handles requests using a form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hola' method='post'>" + //submit a request to /hola (reusar lo de arriba)
                "<input type='text' name='name'>" +
                "<input type='submit' value='Saludame'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
