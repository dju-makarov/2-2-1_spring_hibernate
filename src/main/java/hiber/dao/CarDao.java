package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarDao {

    Car findOne(Long id);

    List<Car> findAll();

    Car save(Car car);
}