package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.CorporateUser;

public interface CorporateUserService {
	
	Result addCorporateUser(CorporateUser corporateUser);
	
	DataResult<List<CorporateUser>> getAll();

}
