package com.example.sprint_boot_rest.controller;

import com.example.sprint_boot_rest.model.JobPost;
import com.example.sprint_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping(path = "jobPosts", produces = {"application/json"})
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{jobID}")
    public JobPost getJob(@PathVariable("jobID") int jobID){
        return jobService.getJob(jobID);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public void updateJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
    }

    @DeleteMapping("jobPost/{jobID}")
    public void deleteJob(@PathVariable("jobID") int jobID){
        jobService.deleteJob(jobID);
    }
}
