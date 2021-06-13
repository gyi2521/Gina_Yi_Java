package com.service.controllers;

import com.service.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {

    private static int idCounter = 1;

    List<String> answers = new ArrayList<>(
            Arrays.asList(
                    "It is Certain.",
                    "Most likely.",
                    "Yes definitely.",
                    "Cannot predict now.",
                    "Better not tell you now.",
                    "Outlook not so good.",
                    "Very doubtful.",
                    "Without a doubt."
            )
    );

    @PostMapping(value = "/magic")
    @ResponseStatus(HttpStatus.CREATED)
    public Answer createQuestion(@RequestBody Answer answerObj){

        Random random = new Random();

        int randomAnswerIndex = random.nextInt(answers.size());
        answerObj.setAnswer(answers.get(randomAnswerIndex));
        answerObj.setId(idCounter++);
        return answerObj;
    }

}
