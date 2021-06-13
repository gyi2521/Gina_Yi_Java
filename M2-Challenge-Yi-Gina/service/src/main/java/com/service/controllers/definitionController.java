package com.service.controllers;

import com.service.model.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class definitionController {

    private static int idCounter = 1;

    private List<Definition> definitions = new ArrayList<>(
            Arrays.asList(
                    new Definition(idCounter++, "bootcamp", "a short, intensive, and rigorous course of training"),
                    new Definition(idCounter++, "java", "coffee" ),
                    new Definition(idCounter++, "mockito", "an alcohol-free drink resembling a mojito cocktail"),
                    new Definition(idCounter++, "framework", "an essential supporting structure of a building, vehicle, or object"),
                    new Definition(idCounter++, "API", "Application Programming Interface, which is a software intermediary that allows two applications to talk to each other"),
                    new Definition(idCounter++, "JPA", "The Java Persistence API (JPA) is a Java specification for accessing, persisting, and managing data between Java objects / classes and a relational database"),
                    new Definition(idCounter++, "schema", "a representation of a plan or theory in the form of an outline or model"),
                    new Definition(idCounter++, "Jenkins", "is a free and open source automation server. It helps automate the parts of software development related to building, testing, and deploying, facilitating continuous integration and continuous delivery"),
                    new Definition(idCounter++, "interface", "a point where two systems, subjects, organizations, etc. meet and interact"),
                    new Definition(idCounter++, "DevOps", "is the combination of practices and tools designed to increase an organization's ability to deliver applications and services faster than traditional software development processes")
            )
    );

    @GetMapping(value = "/word")
    @ResponseStatus(HttpStatus.OK)
    public Definition getDefinition(){

        Random rand = new Random();
        int randomQuoteIndex = rand.nextInt(definitions.size());
        return definitions.get(randomQuoteIndex);

    }
}
