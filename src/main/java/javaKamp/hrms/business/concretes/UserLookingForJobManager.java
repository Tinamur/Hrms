package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.UserLookingForJobService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.core.utilities.results.SuccessResult;
import javaKamp.hrms.dataAccess.abstracts.UserLookingForJobDao;
import javaKamp.hrms.entities.concretes.UserLookingForJob;

@Service
public class UserLookingForJobManager implements UserLookingForJobService{

	private UserLookingForJobDao userLookingForJobDao;

	@Autowired
	public UserLookingForJobManager(UserLookingForJobDao userLookingForJobDao) {
		super();
		this.userLookingForJobDao = userLookingForJobDao;
	}

	@Override
	public Result addUserLookingForJob(UserLookingForJob userLookingForJob) {
		this.userLookingForJobDao.save(userLookingForJob);
		return new SuccessResult("İş Arayan Kaydı başarılı");
		
	}

	@Override
	public DataResult<List<UserLookingForJob>> getAll() {
		
		return new SuccessDataResult<List<UserLookingForJob>>
		(this.userLookingForJobDao.findAll(),"İş Arayan Kullanıcılar Listelendi");
	}

}
