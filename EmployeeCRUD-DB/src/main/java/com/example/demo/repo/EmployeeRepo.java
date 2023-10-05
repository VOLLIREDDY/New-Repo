package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, ID> {

	
}
