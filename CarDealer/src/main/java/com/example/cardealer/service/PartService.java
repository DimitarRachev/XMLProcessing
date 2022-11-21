package com.example.cardealer.service;

import java.util.List;

import com.example.car_dealer.model.entity.Part;

public interface PartService {
  void save(Part part);

  long count();
  List<Part> getRandomParts();
}
