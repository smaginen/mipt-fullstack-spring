package com.mipt.fullstack.spring.rest;

import com.mipt.fullstack.spring.dto.CarDTO;
import com.mipt.fullstack.spring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public Iterable<CarDTO> getCars() {
        return carService.findAll();
    }
}
