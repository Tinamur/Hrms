package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.EmailVerification;

public interface EmailVerificationDao extends JpaRepository<EmailVerification, Integer>{
	EmailVerification getByUserId(int id);
}
