package com.organisation.applitrackbackend.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "date_of_application", nullable = false)
    private Date date_of_application;

    @Column(name = "company_name", nullable = false)
    private String company_name;

    @Column(name = "role", nullable = false)
    private String role;

}
