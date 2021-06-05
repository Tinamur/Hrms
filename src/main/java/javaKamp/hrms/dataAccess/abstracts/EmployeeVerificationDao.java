package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.EmployeeVerification;

public interface EmployeeVerificationDao extends JpaRepository<EmployeeVerification, Integer>{

}
