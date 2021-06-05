package javaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaKamp.hrms.business.abstracts.IndividualUserService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.entities.concretes.IndividualUser;

@RestController
@RequestMapping("/api/users/individual")
public class IndividualUserController {

	private IndividualUserService individualUserService;
	
	@Autowired
	public IndividualUserController(IndividualUserService individualUserService) {
		super();
		this.individualUserService = individualUserService;
	}

	@GetMapping("/getall")
	public DataResult<List<IndividualUser>> getAll(){
		return this.individualUserService.getAll();
	}
	
}
