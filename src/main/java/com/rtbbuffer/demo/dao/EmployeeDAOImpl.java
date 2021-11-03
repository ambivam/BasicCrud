package com.rtbbuffer.demo.dao;

import com.rtbbuffer.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    List<Employee> employees = new ArrayList<>();

    @Override
    public int addEmployee(Employee emp) {
        employees.add(emp);
        return 1;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        for(Employee employee : employees){
            if(employee.getEmpId() == id){
                return employee;
            }
        }
        return null;
    }

    @Override
    public int deleteEmployee(int id) {
        Employee deleteEmployee = null;
        for(Employee employee : employees){
            if(employee.getEmpId() == id){
                deleteEmployee = employee;
            }
        }
        if(deleteEmployee != null){
            employees.remove(deleteEmployee);
            return 1;
        }else{
            return 0;
        }
    }
}
