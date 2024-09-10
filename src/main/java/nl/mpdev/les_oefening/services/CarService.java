package nl.mpdev.les_oefening.services;

import nl.mpdev.les_oefening.models.Car;
import nl.mpdev.les_oefening.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

  private final CarRepository carRepository;

  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public Car getCarById(int id) {
    Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("No Book found"));
    return car;
  }

  public List<Car> getAllCars() {
    return carRepository.findAll();
  }

  public List<Car> getCarsByBrand(String brand) {
    return carRepository.findCarsByBrand(brand);
  }

  public List<Car> getCarsByModel(String model) {
    return carRepository.findCarsByModel(model);
  }
  public List<Car> getCarsByBrandAndModel(String brand, String model) {
    return carRepository.findCarsByBrandAndModel(brand, model);
  }

}
