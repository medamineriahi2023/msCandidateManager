package fr.oga.mscandidatemanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateRestApi {
    private String title = "hello, i'm the candidate Microservice";

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
}
