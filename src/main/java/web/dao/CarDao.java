package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

public interface CarDao {

    List<Car> showCars(int value);

}
