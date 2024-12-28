package com.example.python_quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.python_quiz.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Long> {
    
}
