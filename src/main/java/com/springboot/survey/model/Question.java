package com.springboot.survey.model;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_sequence")
    @Column( name = "question_id")
    private int id;

    @Column(name = "question_text")
    private String text;
}
