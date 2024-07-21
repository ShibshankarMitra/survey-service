package com.springboot.survey.model;

import jakarta.persistence.*;

@Entity
public class Response {

    @Id
    @GeneratedValue ( strategy = GenerationType.SEQUENCE, generator = "response_sequence")
    @Column(name = "response_id")
    private int id;

    @Column(name = "question_id")
    @OneToMany(mappedBy = "question")
    private Question question;

    @Column(name = "answer_id")
    @OneToMany(mappedBy = "answer")
    private Answer answer;
}
