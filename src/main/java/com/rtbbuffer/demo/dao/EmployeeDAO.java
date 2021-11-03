package com.rtbbuffer.demo.dao;

import com.rtbbuffer.demo.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    int addEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    int deleteEmployee(int id);
}
