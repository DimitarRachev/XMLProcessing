package com.example.cardealer.service;

import java.util.Collection;
import java.util.List;

import com.example.cardealer.model.dto.SaleDetailsDto;
import com.example.cardealer.model.entity.Car;
import com.example.cardealer.model.entity.Customer;


public interface SaleService {

  void save(Car car, Customer customer, Double discount);

  List<SaleDetailsDto> getSalesWithDiscount();
}
