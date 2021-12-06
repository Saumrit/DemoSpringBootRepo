package com.mySpringBootLearn.myJPAlearn.service;

import java.util.List;

import com.mySpringBootLearn.myJPAlearn.MyEntity.TheEmployee;

public interface MyEmployeeService {
	
	public List<TheEmployee> findAll();
	
	public TheEmployee findById(int id);
	
	public void saveEmployeeData(TheEmployee emp);
	
	public void deleteId(int id);
}
