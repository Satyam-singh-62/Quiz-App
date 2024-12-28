package com.example.quiz.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.QuizQuestion;

@Repository
public interface questionRepo extends JpaRepository<QuizQuestion,Long>{

}
