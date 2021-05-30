package javaKamp.hrms.business.abstracts;

import javaKamp.hrms.core.utilities.results.Result;

public interface EmailVerificationService {
	Result checkEmailRegex(String email);
	Result checkEmailDatabase(String email);
	Result verifyEmail(int userId, String verificationCode);
}
