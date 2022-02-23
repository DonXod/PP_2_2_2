package web.model;

public class Car {
    private String model;
    private int series;
    private boolean isNewCar;

    public Car() {}

    public Car(String model, int series, boolean isNewCar) {
        this.model = model;
        this.series = series;
        this.isNewCar = isNewCar;
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

    public boolean isNewCar() {
        return isNewCar;
    }

    public void setNewCar(boolean newCar) {
        isNewCar = newCar;
    }

}
