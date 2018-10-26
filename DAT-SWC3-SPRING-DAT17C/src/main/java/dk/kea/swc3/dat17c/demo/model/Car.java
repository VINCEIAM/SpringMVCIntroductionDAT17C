package dk.kea.swc3.dat17c.demo.model;

public class Car {
    private String make;
    private String model;
    private Integer year;
    private Integer horsepower;

    public Car(String make, String model, Integer
            year, Integer horsepower) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }
}
