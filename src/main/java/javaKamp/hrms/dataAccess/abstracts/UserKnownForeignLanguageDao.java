package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.UserKnownForeignLanguage;

public interface UserKnownForeignLanguageDao extends JpaRepository<UserKnownForeignLanguage, Integer>{

}
