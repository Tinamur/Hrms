package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.CorporateUser;

public interface CorporateUserDao extends JpaRepository<CorporateUser, Integer>{

}
