package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.IndividualUser;

public interface IndividualUserService {
	
	DataResult<List<IndividualUser>> getAll();
	Result checkPersonAndEmail(IndividualUser individualUser);
}
