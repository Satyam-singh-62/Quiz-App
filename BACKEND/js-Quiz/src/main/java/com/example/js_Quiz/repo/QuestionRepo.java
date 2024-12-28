package com.example.js_Quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.js_Quiz.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {
    
}
