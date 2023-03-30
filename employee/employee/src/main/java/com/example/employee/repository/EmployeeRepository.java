package com.example.employee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Department;
import com.example.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  Optional<Employee> findByEmail(String email);

  List<Employee> findByDepartmentAndDayAndIsPresent(
      Department department, Integer day, Boolean isPresent);

  List<Employee> findByCityAndDayAndIsPresent(
      String city, Integer day, Boolean isPresent);

}
