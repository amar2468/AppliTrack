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

    @Column(name = "company_name", nullable = false, length = 50)
    private String company_name;

    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @Column(name = "job_description")
    @Lob
    private String job_description;

    @Column(name = "upload_cv", length = 100)
    private String upload_cv;

    @Column(name = "upload_cover_letter", length = 100)
    private String upload_cover_letter;

    @Column(name = "status_of_application", nullable = false, length = 50)
    private String status_of_application;

    public JobApplication() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDate_of_application() {
        return date_of_application;
    }

    public void setDate_of_application(Date date_of_application) {
        this.date_of_application = date_of_application;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getUpload_cv() {
        return upload_cv;
    }

    public void setUpload_cv(String upload_cv) {
        this.upload_cv = upload_cv;
    }

    public String getUpload_cover_letter() {
        return upload_cover_letter;
    }

    public void setUpload_cover_letter(String upload_cover_letter) {
        this.upload_cover_letter = upload_cover_letter;
    }

    public String getStatus_of_application() {
        return status_of_application;
    }

    public void setStatus_of_application(String status_of_application) {
        this.status_of_application = status_of_application;
    }
}
