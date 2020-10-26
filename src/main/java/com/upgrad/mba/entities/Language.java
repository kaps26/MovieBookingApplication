package com.upgrad.mba.entities;

import javax.persistence.*;

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int languageId;

    @Column(length = 20, nullable = false, unique = true)
    private String languageName;
}
