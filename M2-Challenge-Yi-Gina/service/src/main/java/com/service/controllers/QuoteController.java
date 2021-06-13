package com.service.controllers;

import com.service.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private List<Quote> quotes = new ArrayList<>(
            Arrays.asList(
                    new Quote(idCounter++, "Walt Disney", "The way to get started is to quit talking and begin doing."),
                    new Quote(idCounter++, "John Lennon", "Life is what happens when you're busy making other plans" ),
                    new Quote(idCounter++, "Mother Teresa", "Spread love everywhere you go. Let no one ever come to you without leaving happier"),
                    new Quote(idCounter++, "Eleanor Roosevelt", "The future belongs to those who believe in the beauty of their dreams." ),
                    new Quote(idCounter++, "Benjamin Franklin", "Tell me and I forget. Teach me and I remember. Involve me and I learn."  ),
                    new Quote(idCounter++, "Helen Keller", "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart."  ),
                    new Quote(idCounter++, "Aristotle", "It is during our darkest moments that we must focus to see the light."  ),
                    new Quote(idCounter++, "Anne Frank", "Whoever is happy will make others happy too." ),
                    new Quote(idCounter++, "Ralph W Emerson", "Do not go where the path may lead, go instead where there is no path and leave a trail."),
                    new Quote(idCounter, "Thomas A. Edison", "Many of life's failures are people who did not realize how close they were to success when they gave up.")
         )
    );

    @GetMapping(value = "/quote")
    @ResponseStatus(HttpStatus.OK)
    public Quote getQuote(){

           Random rand = new Random();
           int randomQuoteIndex = rand.nextInt(quotes.size());
           return quotes.get(randomQuoteIndex);

    }
}
