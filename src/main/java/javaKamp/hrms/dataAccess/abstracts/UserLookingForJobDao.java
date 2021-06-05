package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.UserLookingForJob;

public interface UserLookingForJobDao extends JpaRepository<UserLookingForJob, Integer>{

}
