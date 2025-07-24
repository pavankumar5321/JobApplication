package com.jobApplication.job.JobImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jobApplication.job.Job;
import com.jobApplication.job.JobService;


@Service
public class JobServiceImpl implements JobService{
	
	private List<Job> jobs = new ArrayList<>();
	private Long nextId = 1L;

	@Override
	public List<Job> findAll() {
		return jobs;
	}

	@Override
	public void createJob(Job job) {
		job.setId(nextId++);
		jobs.add(job);
		
	}

}
