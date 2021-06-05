package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.JobAdvertisementService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.dataAccess.abstracts.JobAdvertisementDao;
import javaKamp.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisements() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveTrue(),"Aktif İş ilanları Listeleniyor");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsOrderByDate() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveTrueOrderByLastApplicationDate(),"Aktif İş ilanları Listeleniyor");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndCorporateId(int corporateId) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveTrueAndCorporateId(corporateId),
				"Şirkete Ait Aktif İş ilanları Listeleniyor");
	}

}
