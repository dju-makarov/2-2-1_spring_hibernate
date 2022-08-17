package hiber.service;

import hiber.model.Car;

import java.util.List;

public interface CarService {

    Car findOne(Long id);

    List<Car> findAll();

    Car save(Car car);
}