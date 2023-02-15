package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String showCarsList(@RequestParam(name = "count", defaultValue = "5") int value,
                               Model model) {
        if (value >= 5) {
            List<Car> carList = new ArrayList<>(carService.showCars(value));
            value = carList.size();
        }
        model.addAttribute("cars", carService.showCars(value));
        return "cars";
    }

}
