package fr.gwombat.springmvcfilters.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by guillaume.
 *
 * @since 23/06/2018
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello " + System.getProperty("user.home") + "\nWe are: " + LocalDate.now();
    }


}
