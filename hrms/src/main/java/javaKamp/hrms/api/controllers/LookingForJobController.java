package javaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaKamp.hrms.business.abstracts.UserLookingForJobService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.UserLookingForJob;

@RestController
@RequestMapping("/api/users/individual/lookingforjob")
public class LookingForJobController {

	private UserLookingForJobService userLookingForJobService;
	
	@Autowired
	public LookingForJobController(UserLookingForJobService userLookingForJobService) {
		super();
		this.userLookingForJobService = userLookingForJobService;
	}


	@GetMapping("/getall")
	public DataResult<List<UserLookingForJob>> getAll(){
		return this.userLookingForJobService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody UserLookingForJob userLookingForJob) {
		return this.userLookingForJobService.addUserLookingForJob(userLookingForJob);
	}
}
