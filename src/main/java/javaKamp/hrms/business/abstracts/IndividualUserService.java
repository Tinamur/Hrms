package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.entities.concretes.IndividualUser;

public interface IndividualUserService {
	
	DataResult<List<IndividualUser>> getAll();
}
