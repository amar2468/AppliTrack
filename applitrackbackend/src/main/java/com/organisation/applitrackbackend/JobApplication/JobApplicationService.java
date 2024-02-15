package com.organisation.applitrackbackend.JobApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    @Autowired
    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }


    public List<JobApplication> getJobApplications()
    {
        return jobApplicationRepository.findAll();
    }

    public void adding_job_application(@RequestBody JobApplication jobApplication)
    {
        jobApplicationRepository.save(jobApplication);
    }

    public void delete_job_application(Long job_id) {
        boolean job_application_exists = jobApplicationRepository.existsById(job_id);

        if(!job_application_exists)
        {
            throw new IllegalStateException("Job application ID " + job_id + " does not exist");
        }

        jobApplicationRepository.deleteById(job_id);
    }
}
