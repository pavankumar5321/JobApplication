package com.jobApplication.job;

import java.util.List;

public interface JobService {

	List<Job> findAll();
	void createJob(Job job);

}
