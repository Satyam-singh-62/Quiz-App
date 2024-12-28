package com.example.python_quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.python_quiz.entity.Question;
import com.example.python_quiz.service.PythonService;

@RestController
public class QuizController {

    @Autowired
    PythonService pythonService;
    
    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return pythonService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public Question saveQuestion(@RequestBody Question question) {
        return pythonService.saveQuestion(question);
    }
}
