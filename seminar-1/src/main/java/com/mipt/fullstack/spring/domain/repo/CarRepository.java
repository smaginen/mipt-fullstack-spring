package com.mipt.fullstack.spring.domain.repo;

import com.mipt.fullstack.spring.domain.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
