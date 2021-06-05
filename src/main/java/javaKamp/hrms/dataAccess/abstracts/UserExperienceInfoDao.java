package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.UserExperienceInfo;

public interface UserExperienceInfoDao extends JpaRepository<UserExperienceInfo, Integer>{

}
