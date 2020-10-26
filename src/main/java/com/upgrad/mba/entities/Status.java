package com.upgrad.mba.entities;

import javax.persistence.*;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int statusId;

    @Column(length = 20, nullable = false, unique = true)
    private String statusName;
}
