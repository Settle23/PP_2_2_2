package web.model;

import web.controller.CarsController;

public class Car {
    private String model;
    private int series;
    private String coolOrSucks;
    public Car() {}

    public Car(String model, int series, String coolOrSucks) {
        this.model = model;
        this.series = series;
        this.coolOrSucks = coolOrSucks;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCoolOrSucks() {
        return coolOrSucks;
    }

    public void setCoolOrSucks(String coolOrSucks) {
        this.coolOrSucks = coolOrSucks;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", coolOrSucks='" + coolOrSucks + '\'' +
                '}';
    }
}
