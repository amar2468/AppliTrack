package com.organisation.applitrackbackend.JobApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job_application_manager")
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
    public void addJobApplication(@RequestBody JobApplication jobApplication)
    {
        jobApplicationService.addJobApplication(jobApplication);
    }

    @DeleteMapping("/delete_job_application/{job_application_id}")
    public void deleteJobApplication(@PathVariable("job_application_id") Long job_id)
    {
        jobApplicationService.deleteJobApplication(job_id);
    }
}
