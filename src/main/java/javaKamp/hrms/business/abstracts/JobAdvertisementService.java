package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getActiveAdvertisements();
	
	DataResult<List<JobAdvertisement>> getActiveAdvertisementsOrderByDate();
	
	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndCorporateId(int corporateId);
}
