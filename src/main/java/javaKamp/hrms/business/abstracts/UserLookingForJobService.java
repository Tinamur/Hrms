package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.UserLookingForJob;

public interface UserLookingForJobService {
	Result addUserLookingForJob(UserLookingForJob userLookingForJob);
	DataResult<List<UserLookingForJob>> getAll();
}
