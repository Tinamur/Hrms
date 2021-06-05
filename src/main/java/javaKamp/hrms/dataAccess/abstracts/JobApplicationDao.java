package javaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.JobApplication;

public interface JobApplicationDao extends JpaRepository<JobApplication, Integer>{

}
