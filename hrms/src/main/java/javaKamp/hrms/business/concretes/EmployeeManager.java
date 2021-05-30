package javaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaKamp.hrms.business.abstracts.EmployeeService;
import javaKamp.hrms.business.abstracts.IndividualUserService;
import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.core.utilities.results.SuccessDataResult;
import javaKamp.hrms.dataAccess.abstracts.EmployeeDao;
import javaKamp.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	private IndividualUserService individualUserService;
	
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Autowired
	public EmployeeManager(IndividualUserService individualUserService) {
		super();
		this.individualUserService = individualUserService;
	}


	@Override
	public Result addEmployee(Employee employee) {
		//SPAGETTİCİ BURADA!!!
		return this.individualUserService.checkPersonAndEmail(employee);
	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(),"HRMS çalışanları Listelendi");
	}

}
