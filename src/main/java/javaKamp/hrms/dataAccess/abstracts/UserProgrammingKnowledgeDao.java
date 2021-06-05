package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.UserProgrammingKnowledge;

public interface UserProgrammingKnowledgeDao extends JpaRepository<UserProgrammingKnowledge, Integer>{

}
