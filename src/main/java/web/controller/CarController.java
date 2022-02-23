package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count,
                          Model model) {
        if((count < 0) || (count >= 6)) count = 5;
        model.addAttribute("car", carService.listCars(count));
        return "cars";
    }

}
