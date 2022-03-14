package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

import Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/employee")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}
	
	public Employee getEmployee(@PathVariable() String id) {
		return empService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void addEmployee(@RequestBody Employee employee) {
		empService.addEmployee(employee);
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee emp,@PathVariable String id) {
		empService.updateEmployee(emp, id);
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		
	}

}
