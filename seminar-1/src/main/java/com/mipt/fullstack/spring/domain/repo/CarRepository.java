package com.mipt.fullstack.spring.domain.repo;

import com.mipt.fullstack.spring.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
