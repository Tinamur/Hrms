package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.entities.abstracts.User;

public interface UserService {


	DataResult<List<User>> getAll();
	
}
