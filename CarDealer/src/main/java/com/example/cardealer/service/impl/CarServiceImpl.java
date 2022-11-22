package com.example.cardealer.service.impl;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;


import com.example.cardealer.model.dto.CarExportDto;
import com.example.cardealer.model.dto.CarWithPartsListDto;
import com.example.cardealer.model.entity.Car;
import com.example.cardealer.repository.CarRepository;
import com.example.cardealer.service.CarService;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
  private final CarRepository carRepository;
  private final Random random;
  private final ModelMapper mapper;

  @Override public long count() {
    return carRepository.count();
  }

  @Override public void save(Car car) {
    carRepository.save(car);
  }

  @Override public Car getRandomCar() {
    long id = random.nextLong(carRepository.count()) + 1L;
    return carRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  @Override public List<CarExportDto> getAllToyotas(String make) {
    return carRepository
      .findAllByMakeOrderByModelAscTravelledDistanceDesc(make)
      .stream()
      .map(c -> mapper.map(c, CarExportDto.class))
      .toList();
  }

  @Transactional
  @Override public List<CarWithPartsListDto> getCarsWithPartsList() {

    return carRepository.
      findAll()
      .stream()
      .map(c -> mapper.map(c, CarWithPartsListDto.class))
      .toList();
  }
}
