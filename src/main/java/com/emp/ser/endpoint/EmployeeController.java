package com.emp.ser.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.ser.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping("/getemp")
	public ResponseEntity<Employee> getEmployee(){
		Employee emp = new Employee("Ritesh", "Pune");
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
}
