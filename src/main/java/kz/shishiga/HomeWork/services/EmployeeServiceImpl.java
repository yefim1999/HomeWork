package kz.shishiga.HomeWork.services;

import kz.shishiga.HomeWork.entities.Employee;
import kz.shishiga.HomeWork.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> join() {
        return employeeRepository.join();
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public List<Employee> findByFIO(String FIO) {
        return employeeRepository.findByFIO(FIO);
    }
}
