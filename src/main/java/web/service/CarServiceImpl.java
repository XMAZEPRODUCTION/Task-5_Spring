package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final List<Car> list1 = new ArrayList<>();
    {
        list1.add(new Car("BMW","White",2021));
        list1.add(new Car("Ford","Blue",2024));
        list1.add(new Car("Mercedes-Benz","Red",2010));
        list1.add(new Car("Toyota","Black",2000));
        list1.add(new Car("Lada","Green",1997));
    }

    @Override
    public List<Car> list(int x) {
        return list1.stream()
                .limit(x)
                .toList();
    }
}
