package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceWeb {

    @GetMapping("/bonjour")
    public String disBonjour(){
        return "Bonjour";
    }
}
