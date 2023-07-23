package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> show(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche", 911, "cool"));
        cars.add(new Car("Land Cruiser", 200, "cool"));
        cars.add(new Car("VAZ", 2106, "sucks"));
        cars.add(new Car("VAZ", 2107, "sucks"));
        cars.add(new Car("Infiniti", 80, "cool"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
