package nl.mpdev.les_oefening.controllers;

import nl.mpdev.les_oefening.models.Car;
import nl.mpdev.les_oefening.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CarController {

  @Autowired
  private CarService carService;

  @GetMapping("/cars")
  public ResponseEntity<List<Car>> getCars(
    @RequestParam(name = "brand", required = false) String brand,
    @RequestParam(name = "model", required = false) String model
  ) {
    if (brand != null && model != null) {
      return ResponseEntity.ok().body(carService.getCarsByBrandAndModel(brand, model));
    }
    else if (brand != null) {
      return ResponseEntity.ok().body(carService.getCarsByBrand(brand));
    }
    else if (model != null) {
      return ResponseEntity.ok().body(carService.getCarsByModel(model));
    }
    return ResponseEntity.ok().body(carService.getAllCars());
  }

  // Kept this one in for example purposes
//  @GetMapping("/cars/brand")
//  public ResponseEntity<List<Car>> getCarsByBrand(@RequestParam(name = "brand") String brand) {
//    return ResponseEntity.ok().body(carService.getCarByBrand(brand));
//  }
}
