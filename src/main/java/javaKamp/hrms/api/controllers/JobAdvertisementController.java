package javaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaKamp.hrms.business.abstracts.JobAdvertisementService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getActiveAdvertisements")
	public DataResult<List<JobAdvertisement>> getActiveAdvertisements(){
		return this.jobAdvertisementService.getActiveAdvertisements();
	}
	
	@GetMapping("/getActiveAdvertisements/orderbydate")
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsOrderByDate(){
		return this.jobAdvertisementService.getActiveAdvertisementsOrderByDate();
	}
	
	@PostMapping("/getActiveAdvertisements/getByCorporateId")
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsOneCorporate(@RequestBody int corporateId){
		return this.jobAdvertisementService.getByIsActiveTrueAndCorporateId(corporateId);
	}
	
}
