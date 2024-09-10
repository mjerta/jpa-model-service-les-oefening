package nl.mpdev.les_oefening.repository;

import nl.mpdev.les_oefening.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Integer> {
  List<Car> findCarsByBrand(String brand);
  List<Car> findCarsByModel(String model);
  List<Car> findCarsByBrandAndModel(String brand, String model);
}
