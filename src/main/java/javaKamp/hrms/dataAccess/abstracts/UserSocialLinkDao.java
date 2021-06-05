package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.UserSocialLink;

public interface UserSocialLinkDao extends JpaRepository<UserSocialLink, Integer>{

}
