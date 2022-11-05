package com.mipt.fullstack.spring;

import com.mipt.fullstack.spring.domain.model.Car;
import com.mipt.fullstack.spring.domain.repo.CarRepository;
import com.mipt.fullstack.spring.domain.model.Owner;
import com.mipt.fullstack.spring.domain.repo.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

    private static final Logger logger =
            LoggerFactory.getLogger(MainApplication.class);

    @Autowired
    private CarRepository carRepository;


    @Autowired
    private OwnerRepository ownerRepository;


    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
// Add owner objects and save these to db
        // Add owner objects and save these to db
        Owner owner1 = new Owner("John", "Johnson");
        Owner owner2 = new Owner("Mary", "Robinson");
        ownerRepository.saveAll(Arrays.asList(owner1, owner2));

        // Add car object and link to owners and save these to db
        Car car1 = new Car("Ford", "Mustang", "Red",
                "ADF-1121", 2021, 59000, owner1);
        Car car2 = new Car("Nissan", "Leaf", "White",
                "SSJ-3002", 2019, 29000, owner2);
        Car car3 = new Car("Toyota", "Prius", "Silver",
                "KKO-0212", 2020, 39000, owner2);
        carRepository.saveAll(Arrays.asList(car1, car2, car3));

        for (Car car : carRepository.findAll()) {
            logger.info(car.getBrand() + " " + car.getModel());
        }
    }
//    public static final Owner getOwner(
//                String firstName,
//                String lastName
//
//        ) {
//        return Owner.builder().
//                firstname(firstName)
//                .lastname(lastName)
//                .build();
//    }
//    public static final Car getCar(
//            String brand,
//            String model,
//            String color,
//            String registerNumber, int year,
//            int price,
//            Owner owner
//
//    ) {
//        return Car.builder()
//                .brand(brand)
//                .model(model)
//                .color(color)
//                .registerNumber(registerNumber)
//                .year(year)
//                .price(price)
//                .owner(owner)
//                .build();
//    }
}
