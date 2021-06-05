package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.IndividualUserService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.dataAccess.abstracts.IndividualUserDao;
import javaKamp.hrms.entities.concretes.IndividualUser;

@Service
public class IndividualUserManager implements IndividualUserService{

	private IndividualUserDao individualUserDao;

	
	@Autowired
	public IndividualUserManager(IndividualUserDao individualUserDao){
		super();
		this.individualUserDao = individualUserDao;

	}

	@Override
	public DataResult<List<IndividualUser>> getAll() {
		return new SuccessDataResult<List<IndividualUser>>
		(this.individualUserDao.findAll(),"Bireysel Müşteriler Listelendi");
	}
		
	
//	public Result checkPersonAndEmail(IndividualUser individualUser) {
//		//SPAGETTİCİ BURADA!!!
//		if(this.userCheckService.checkIfRealPerson(individualUser).isSuccess()) {
//			if(this.emailVerificationService.checkEmailRegex(individualUser.getEmail()).isSuccess()) {
//				if(this.emailVerificationService.checkEmailDatabase(individualUser.getEmail()).isSuccess()) {
//					return new SuccessResult("Sistem Çalışanı Başarılı bir şekilde kayıt edildi");
//				}else {
//					return emailVerificationService.checkEmailDatabase(individualUser.getEmail());
//				}
//			}else {
//				return emailVerificationService.checkEmailRegex(individualUser.getEmail());
//			}
//		}else {
//			return this.userCheckService.checkIfRealPerson(individualUser);
//		}
//		
//	}
	
	
}
