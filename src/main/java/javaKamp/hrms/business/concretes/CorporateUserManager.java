package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.CorporateUserService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.core.utilities.results.SuccessResult;
import javaKamp.hrms.dataAccess.abstracts.CorporateUserDao;
import javaKamp.hrms.entities.concretes.CorporateUser;

@Service
public class CorporateUserManager implements CorporateUserService{
	
	private CorporateUserDao corporateUserDao;
	
	@Autowired
	public CorporateUserManager(CorporateUserDao corporateUserDao) {
		super();
		this.corporateUserDao = corporateUserDao;
	}

	@Override
	public Result addCorporateUser(CorporateUser corporateUser) {
		this.corporateUserDao.save(corporateUser);
		return new SuccessResult("Şirket başarılı Bir şekilde kayıt edildi");
	}
	
	@Override
	public DataResult<List<CorporateUser>> getAll() {
		return new SuccessDataResult<List<CorporateUser>>
		(this.corporateUserDao.findAll(), "İşveren Şirketler Listelendi");
	}



}
