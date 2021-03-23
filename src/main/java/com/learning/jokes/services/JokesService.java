package com.learning.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String joke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
