package javaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaKamp.hrms.business.abstracts.CorporateUserService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.CorporateUser;

@RestController
@RequestMapping("/api/users/corporate")
public class CorporateUserController {

	private CorporateUserService corporateUserService;
	
	@Autowired
	public CorporateUserController(CorporateUserService corporateUserService) {
		super();
		this.corporateUserService = corporateUserService;
	}

	@GetMapping("/getall")
	public DataResult<List<CorporateUser>> getAll(){
		return this.corporateUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CorporateUser corporateUser) {
		return this.corporateUserService.addCorporateUser(corporateUser);
	}
	
	
}
