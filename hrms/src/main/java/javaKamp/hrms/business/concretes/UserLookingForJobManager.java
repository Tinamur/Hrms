package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.IndividualUserService;
import javaKamp.hrms.business.abstracts.UserLookingForJobService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.dataAccess.abstracts.UserLookingForJobDao;
import javaKamp.hrms.entities.concretes.UserLookingForJob;

@Service
public class UserLookingForJobManager implements UserLookingForJobService{

	private UserLookingForJobDao userLookingForJobDao;
	private IndividualUserService individualUserService;

	@Autowired
	public UserLookingForJobManager(UserLookingForJobDao userLookingForJobDao) {
		super();
		this.userLookingForJobDao = userLookingForJobDao;
	}

	public UserLookingForJobManager(IndividualUserService individualUserService) {
		super();
		this.individualUserService = individualUserService;
	}

	@Override
	public Result addUserLookingForJob(UserLookingForJob userLookingForJob) {
		return this.individualUserService.checkPersonAndEmail(userLookingForJob);
		
	}

	@Override
	public DataResult<List<UserLookingForJob>> getAll() {
		
		return new SuccessDataResult<List<UserLookingForJob>>
		(this.userLookingForJobDao.findAll(),"İş Arayan Kullanıcılar Listelendi");
	}

}
