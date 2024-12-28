package com.example.python_quiz.service;

import com.example.python_quiz.entity.Question;
import com.example.python_quiz.repo.QuestionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PythonService {

    @Autowired
    QuestionRepo questionRepo;
    
    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public Question saveQuestion(Question question) {
        return questionRepo.save(question);
    }
}
