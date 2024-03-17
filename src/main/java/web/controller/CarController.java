package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
        private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }
    @GetMapping("/cars")
    public String cars (@RequestParam (value = "count",defaultValue = "5")int count, ModelMap model){
            model.addAttribute("car",carServiceImpl.list(count));
            return "car";
    }
}

