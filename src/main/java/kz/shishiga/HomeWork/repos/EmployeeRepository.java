package kz.shishiga.HomeWork.repos;

import kz.shishiga.HomeWork.entities.Employee;
import kz.shishiga.HomeWork.entities.EmployeeJoin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository("employeeRepository")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    public List<Employee> join();

    public List<Employee> findByFIO(String FIO);
}
