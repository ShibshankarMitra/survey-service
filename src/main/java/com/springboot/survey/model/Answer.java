package com.springboot.survey.model;

import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "answer_sequence")
    @Column(name = "answer_id")
    private int id;

    @Column(name = "answer_text")
    private String text;
}
