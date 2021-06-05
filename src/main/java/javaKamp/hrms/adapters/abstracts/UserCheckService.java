package javaKamp.hrms.adapters.abstracts;

import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.IndividualUser;

public interface UserCheckService {
	
	Result checkIfRealPerson(IndividualUser individualUser);
}
