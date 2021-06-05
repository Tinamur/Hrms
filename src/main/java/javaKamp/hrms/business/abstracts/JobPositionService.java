package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	Result addJob(JobPosition job);
	Result deleteJob(JobPosition job);
	
	DataResult<List<JobPosition>> getAll();

}
