package com.learning.jokes.controller;

import com.learning.jokes.services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    private JokeService jokesService;

    public JokesController(JokeService jokesService) {
        this.jokesService = jokesService;
    }

    public String getJoke(){
        return jokesService.getJoke();
    }
}
