package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Renault", "V4", 111),
            new Car("BMW", "V6", 222),
            new Car("Audi", "V6", 333),
            new Car("Opel", "V8", 444),
            new Car("Lada", "V12", 555)
    );

    @Override
    public List<Car> getAllCars(int count) {
        if (count < 1 || count > cars.size()) {
            count = cars.size();
        }
        return cars.subList(0, count);
    }
}

