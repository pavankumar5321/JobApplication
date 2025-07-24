package com.jobApplication.job;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	private JobService  jobService;
	
	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("/jobs")
	private List<Job> findAll(){
		return jobService.findAll();
	} 
	
	@PostMapping("/jobs")
	public String createJob(@RequestBody Job job) {
		jobService.createJob(job);
		return "Job added successfully";
	}
}
