package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.UserEducationInfo;

public interface UserEducationInfoDao extends JpaRepository<UserEducationInfo, Integer>{

}
