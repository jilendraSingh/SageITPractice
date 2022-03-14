package Repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Employee;

public interface EmployeeRepositry extends CrudRepository<Employee,String> {

}
