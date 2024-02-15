package com.organisation.applitrackbackend.JobApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/job_application_manager")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping("/all_job_applications")
    public List<JobApplication> getJobApplications()
    {
        return jobApplicationService.getJobApplications();
    }

    @PostMapping("/add_job_application")
    public String add_job_application(@RequestBody JobApplication jobApplication)
    {
        jobApplicationService.adding_job_application(jobApplication);
        return "Added new job application";
    }
}
