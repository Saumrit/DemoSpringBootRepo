package com.mySpringBootLearn.myJPAlearn.myDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mySpringBootLearn.myJPAlearn.MyEntity.TheEmployee;

public interface MyEmployeeSpringdataJpaDao extends JpaRepository<TheEmployee, Integer> {

}
