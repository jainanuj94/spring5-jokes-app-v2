package com.learning.jokes.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.platform.commons.util.StringUtils.isBlank;

class JokesServiceTest {

    private JokeService jokesService;

    @BeforeEach
    void setup(){
        jokesService = new JokeServiceImpl();
    }

    @Test
    void shouldReturnRandomQuote(){
        assertFalse(isBlank(jokesService.getJoke()));
    }
}