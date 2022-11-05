package com.mipt.fullstack.spring.service;

import com.mipt.fullstack.spring.domain.model.Car;
import com.mipt.fullstack.spring.domain.repo.CarRepository;
import com.mipt.fullstack.spring.dto.CarDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarService {
    @Autowired
    private MailService mailService;
    private final CarRepository carRepository;

    public Iterable<CarDTO> findAll(){
      log.info("....");
      //aggregate
        mailService.sendEmail();
        //send message to queue
        Iterable<Car> cars = carRepository.findAll();
        List<CarDTO> carDTOS = new ArrayList<>();
        cars.forEach(car -> convertToDto(car, carDTOS));
        return carDTOS;
    }

    private CarDTO convertToDto(Car car, List<CarDTO> carDTOS ) {
        CarDTO carDTO = new CarDTO();
        //from car to CarDto
        return carDTO;
    }
}
