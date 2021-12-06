package com.mySpringBootLearn.myJPAlearn.myJPAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mySpringBootLearn.myJPAlearn.MyEntity.TheEmployee;
import com.mySpringBootLearn.myJPAlearn.service.MyEmployeeService;

@RestController
@RequestMapping("/api/SpringdataJpa")
public class MyController {
	
	private MyEmployeeService employeeservice;
	
	@Autowired
	public MyController( MyEmployeeService employeeservice) {		
		this.employeeservice = employeeservice;
	}
	
	@GetMapping("/getAll")
	public List<TheEmployee> getAll(){
		return employeeservice.findAll();
	}

	@GetMapping("/getByid/{id}")
	public TheEmployee findById(@PathVariable int  id){
		return employeeservice.findById(id);
	}
	
	@GetMapping("/save")
	public void save(TheEmployee emp){
		 employeeservice.saveEmployeeData(emp);
	}
	
	@GetMapping("/delete")
	public void delete(int id){
		employeeservice.deleteId(id);
	}
	

}
