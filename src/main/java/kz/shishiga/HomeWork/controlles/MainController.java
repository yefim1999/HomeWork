package kz.shishiga.HomeWork.controlles;

import kz.shishiga.HomeWork.entities.Employee;
import kz.shishiga.HomeWork.entities.EmployeeJoin;
import kz.shishiga.HomeWork.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/")
    public String home(Map<String, Object> model) {
        List<Employee> employeeJoinList = employeeService.join();
        model.put("employees", employeeJoinList);
        return "home";
    }

    @PostMapping("/")
    public String add(@RequestParam String fio,
                      Map<String, Object> model) {
        Employee employee = new Employee(fio);
        employeeService.save(employee);

        Iterable<Employee> employees = employeeService.findAll();
        model.put("employees", employees);
        return "home";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String tofindfio,
                         Map<String, Object> model) {
        Iterable<Employee> findemployees = employeeService.findByFIO(tofindfio);
        model.put("findemployees", findemployees);
        return "home";
    }
}
