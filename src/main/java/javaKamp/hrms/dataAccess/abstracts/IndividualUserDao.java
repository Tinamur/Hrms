package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.IndividualUser;

public interface IndividualUserDao extends JpaRepository<IndividualUser, Integer>{

}
