package com.amoura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amoura.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
