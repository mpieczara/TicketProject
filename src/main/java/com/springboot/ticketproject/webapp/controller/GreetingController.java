package com.springboot.ticketproject.webapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/greet")
public class GreetingController {
    @RequestMapping({"", "/{person}"})
    public String greetPerson(@PathVariable(name = "person", required = false)
                                      Optional<String> maybePerson) {
        String person = maybePerson.filter(s -> s!=null).orElse("unknown person");
        return String.format("Hello %s!", person);
    }
}
