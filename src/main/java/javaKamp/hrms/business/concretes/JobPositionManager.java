package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.JobPositionService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.core.utilities.results.SuccessResult;
import javaKamp.hrms.dataAccess.abstracts.JobPositionDao;
import javaKamp.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao availableJobsDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao availableJobsDao) {
		super();
		this.availableJobsDao = availableJobsDao;
	}

	@Override
	public Result addJob(JobPosition job) {
		this.availableJobsDao.save(job);
		return new SuccessResult("İş pozisyonu başarılı bir şekilde eklendi");
	}

	@Override
	public Result deleteJob(JobPosition job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>> 
		(this.availableJobsDao.findAll(), "Açık iş ilanları listelendi");
	}

}
