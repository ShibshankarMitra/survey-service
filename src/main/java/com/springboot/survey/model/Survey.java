package com.springboot.survey.model;

import jakarta.persistence.*;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "survey_sequence")
    @Column(name = "survey_id")
    private int id;

    @Column(name = "survey_name")
    private String name;

}
