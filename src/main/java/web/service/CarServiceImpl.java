package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carlist = new ArrayList<>(List.of(
            new Car("Nissan", 2010, 750000),
            new Car("Mitsubishi", 2018, 1600000),
            new Car("Audi", 2015, 2100000),
            new Car("Geely", 2022, 3200000),
            new Car("Mazda", 2011, 600000)
    ));

    @Override
    public List<Car> getCarList(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return carlist.stream().limit(count).toList();
    }
}