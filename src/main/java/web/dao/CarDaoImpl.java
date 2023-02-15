package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Audi", "A4", 1998));
        cars.add(new Car("Audi", "A7", 2010));
        cars.add(new Car("Volvo", "XC60", 2016));
        cars.add(new Car("Mazda", "RX7", 2018));
        cars.add(new Car("Kia", "Ceed", 2022));

    }

    @Override
    public List<Car> showCars(int value) {
        List<Car> valueOfCars = new ArrayList<>();
        if (value <= cars.size()) {
            for (int i = 0; i < value; i++) {
                valueOfCars.add(cars.get(i));
            }
        } else {
            for (Car car : cars) {
                valueOfCars.add(car);
            }
        }
        return valueOfCars;
    }
}
