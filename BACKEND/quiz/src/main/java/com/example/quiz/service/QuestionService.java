package com.example.quiz.service;

import com.example.quiz.entity.QuizQuestion;
import com.example.quiz.repo.questionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    questionRepo QuestionRepo;

    public List<QuizQuestion> getAllQuestions() {
        return QuestionRepo.findAll();
    }

    public QuizQuestion saveQuestion(QuizQuestion question) {
        return QuestionRepo.save(question);
    }
}
