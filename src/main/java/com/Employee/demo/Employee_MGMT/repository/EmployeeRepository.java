package com.Employee.demo.Employee_MGMT.repository;


import com.Employee.demo.Employee_MGMT.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
