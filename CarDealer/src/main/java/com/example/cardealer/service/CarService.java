package com.example.cardealer.service;

import java.util.Collection;
import java.util.List;

import com.example.cardealer.model.dto.CarExportDto;
import com.example.cardealer.model.dto.CarWithPartsListDto;
import com.example.cardealer.model.entity.Car;


public interface CarService {
  long count();

  void save(Car car);

  Car getRandomCar();

  List<CarExportDto> getAllToyotas(String make);

  List<CarWithPartsListDto> getCarsWithPartsList();
}
