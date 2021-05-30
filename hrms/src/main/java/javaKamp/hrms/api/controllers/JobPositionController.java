package javaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaKamp.hrms.business.abstracts.JobPositionService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobs")
public class JobPositionController {
	
	private JobPositionService availableJobService;
	
	@Autowired
	public JobPositionController(JobPositionService availableJobService) {
		super();
		this.availableJobService = availableJobService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.availableJobService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.availableJobService.addJob(jobPosition);
	}

}
