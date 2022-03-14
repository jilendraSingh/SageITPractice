package Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee;

import Repositry.EmployeeRepositry;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositry empRepo;
	
	List<Employee> empList=Arrays.asList(
			new Employee("1","Jilendra","Hindi")
			,new Employee("2","Deepak","English"));
	
	public List<Employee> getAllEmployee() {
		empRepo.saveAll(empList);
		return (List<Employee>)empRepo.findAll();
	}
	
	public Employee getEmployee(String id) {
		return empRepo.findById(id).get();
		
	}
	
	public void addEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
	public void updateEmployee(Employee emp,String id) {
		for (int i = 0; i < empList.size(); i++) {
			Employee e = empList.get(i);
			if (e.getId().equals(id)) {
				empList.set(i, emp);
			}
		}
	}
	
	public void deleteEmployee(String id) {
		empRepo.deleteById(id);
	}
	
	
}
