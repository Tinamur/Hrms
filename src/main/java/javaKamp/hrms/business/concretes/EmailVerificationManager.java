package javaKamp.hrms.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.EmailVerificationService;
import javaKamp.hrms.core.utilities.results.ErrorResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.core.utilities.results.SuccessResult;
import javaKamp.hrms.dataAccess.abstracts.EmailVerificationDao;
import javaKamp.hrms.entities.concretes.EmailVerification;

@Service
public class EmailVerificationManager implements EmailVerificationService{

	private EmailVerificationDao emailVerificationDao;
	
	@Autowired
	public EmailVerificationManager(EmailVerificationDao emailVerificationDao) {
		super();
		this.emailVerificationDao = emailVerificationDao;
	}

	@Override
	public Result checkEmailRegex(String email) {
		
				String emailRegex ="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?!-)(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
				Pattern pattern = Pattern.compile(emailRegex);
				Matcher matcher = pattern.matcher(email);
				
				if(matcher.matches()) {
					return new SuccessResult("Email tipi uygun");
					
				}else {
					System.out.println("Lütfen geçerli bir email giriniz!");
					return new ErrorResult("Lütfen geçerli bir Email adresi giriniz!");
				}
	}

	@Override
	public Result verifyEmail(int userId, String verificationCode) {
		EmailVerification dataEmail = emailVerificationDao.getByUserId(userId);
		
		if(dataEmail.getVerificationCode() == verificationCode) {
			dataEmail.setVerified(true);
			return new SuccessResult("Email başarı ile onaylandı");
		}
		
		return new ErrorResult("Email onay kodu yanlış!");
	}

}
