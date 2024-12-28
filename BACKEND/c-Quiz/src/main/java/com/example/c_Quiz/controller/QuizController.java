package com.example.c_Quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.c_Quiz.entity.Question;
import com.example.c_Quiz.security.CService;


@RestController
@RequestMapping("/c")
public class QuizController {

    @Autowired
    CService cService;
    
    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return cService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public Question saveQuestion(@RequestBody Question question) {
        return cService.saveQuestion(question);
    }
}
