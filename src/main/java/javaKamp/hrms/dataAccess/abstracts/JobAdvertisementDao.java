package javaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaKamp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByIsActiveTrue();
	
	List<JobAdvertisement> getByIsActiveTrueOrderByLastApplicationDate();
	
	List<JobAdvertisement> getByIsActiveTrueAndCorporateId(int corporateId);
}
