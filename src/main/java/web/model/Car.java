package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private int price;

    public Car() {
    }

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && year == car.year && price == car.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, price);
    }

    public String toString() {
        return "Car {" +
                "model='" + model +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}