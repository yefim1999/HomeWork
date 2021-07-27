package kz.shishiga.HomeWork.entities;

import javax.persistence.*;

@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer asset_id;

    private String assetName;
    private Integer price;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    public Asset() {
    }

    public Integer getAsset_id() {
        return asset_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setAsset_id(Integer asset_id) {
        this.asset_id = asset_id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
