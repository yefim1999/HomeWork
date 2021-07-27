package kz.shishiga.HomeWork.services;

import kz.shishiga.HomeWork.entities.Employee;
import kz.shishiga.HomeWork.entities.EmployeeJoin;

import java.util.List;

public interface EmployeeService {
    public List<Employee> join();
    public List<Employee> findByFIO(String FIO);
}
