package com.example.sprint_boot_rest.service;

import com.example.sprint_boot_rest.model.JobPost;
import com.example.sprint_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }

    public JobRepo getJobRepo() {
        return jobRepo;
    }

    @Autowired
    public void setJobRepo(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }
}
