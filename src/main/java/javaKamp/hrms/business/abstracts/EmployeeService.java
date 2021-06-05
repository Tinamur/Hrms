package javaKamp.hrms.business.abstracts;

import java.util.List;

import javaKamp.hrms.core.utilities.results.DataResult;
import javaKamp.hrms.core.utilities.results.Result;
import javaKamp.hrms.entities.concretes.Employee;

public interface EmployeeService {
	Result addEmployee(Employee employee);
	DataResult<List<Employee>> getAll();
}
