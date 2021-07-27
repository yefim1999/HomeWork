package kz.shishiga.HomeWork.entities;

import java.io.Serializable;

public class EmployeeJoin implements Serializable {
    private String FIO;
    private Integer numberOfAssets;
    private Integer priceOfAllGoods;

    public EmployeeJoin(String FIO, Integer numberOfAssets, Integer priceOfAllGoods) {
        this.FIO = FIO;
        this.numberOfAssets = numberOfAssets;
        this.priceOfAllGoods = priceOfAllGoods;
    }

    public EmployeeJoin() {
    }

    public Integer getNumberOfAssets() {
        return numberOfAssets;
    }

    public void setNumberOfAssets(Integer numberOfAssets) {
        this.numberOfAssets = numberOfAssets;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Integer getPriceOfAllGoods() {
        return priceOfAllGoods;
    }

    public void setPriceOfAllGoods(Integer priceOfAllGoods) {
        this.priceOfAllGoods = priceOfAllGoods;
    }
}
