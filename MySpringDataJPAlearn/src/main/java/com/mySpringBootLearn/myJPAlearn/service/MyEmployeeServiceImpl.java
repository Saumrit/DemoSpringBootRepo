package com.mySpringBootLearn.myJPAlearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySpringBootLearn.myJPAlearn.MyEntity.TheEmployee;
import com.mySpringBootLearn.myJPAlearn.myDAO.MyEmployeeSpringdataJpaDao;

@Service
public class MyEmployeeServiceImpl implements MyEmployeeService{

	private MyEmployeeSpringdataJpaDao myemployeerepository;
	
	@Autowired
	public void setMyemployeerepository(MyEmployeeSpringdataJpaDao myemployeerepository) {
		this.myemployeerepository = myemployeerepository;
	}
	
	//@Transactional --:Not needed as JpaRepository already provides this functionality
	@Override
	public List<TheEmployee> findAll() {
		
		return myemployeerepository.findAll();
	}

	@Override
	public TheEmployee findById(int id) {
		Optional<TheEmployee> theData = myemployeerepository.findById(id);
		if(theData.isPresent())
			return theData.get();
		else 
			return null;
	}

	@Override
	public void saveEmployeeData(TheEmployee emp) {
		myemployeerepository.save(emp);
		
	}

	@Override
	public void deleteId(int id) {
		myemployeerepository.deleteById(id);
		
	}

}
