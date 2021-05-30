package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
