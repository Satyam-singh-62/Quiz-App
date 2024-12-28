package com.example.js_Quiz.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.js_Quiz.entity.Question;
import com.example.js_Quiz.repo.QuestionRepo;

@Service
public class CService {
    @Autowired
    QuestionRepo questionRepo;
    
    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public Question saveQuestion(Question question) {
        return questionRepo.save(question);
    }
}
