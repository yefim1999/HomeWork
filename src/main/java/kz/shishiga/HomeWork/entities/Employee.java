package kz.shishiga.HomeWork.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    private String FIO;

    @OneToMany(mappedBy = "employee")
    private List<Asset> products = new ArrayList<Asset>(0);

    public Employee() {
    }

    public Employee(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public List<Asset> getProducts() {
        return products;
    }

    public void setProducts(List<Asset> products) {
        this.products = products;
    }
}
