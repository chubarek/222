package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {
    private static List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("BWM X6", 2020, "Dark Green"));
        cars.add(new Car("Mercedes G-Class", 2024, "Black"));
        cars.add(new Car("Audi Q6", 2017, "Red"));
        cars.add(new Car("Mazda XC-5", 2016, "Brown"));
        cars.add(new Car("Volvo XC90", 2021, "Dark Blue"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;
        }
        if (count < 5) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
