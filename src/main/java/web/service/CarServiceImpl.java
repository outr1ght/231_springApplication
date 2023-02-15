package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> showCars(int value) {
        return carDao.showCars(value);
    }
}
