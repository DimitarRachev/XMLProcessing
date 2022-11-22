package com.example.cardealer.service;

import java.util.Collection;
import java.util.List;

import com.example.cardealer.model.dto.CustomerExportDto;
import com.example.cardealer.model.dto.CustomerWithSalesDto;
import com.example.cardealer.model.entity.Customer;


public interface CustomerService {
  long count();

  void save(Customer customer);

  Customer getRandomCustomer();

  List<CustomerExportDto> findAllOrderedByBirthDateAndYoung();

  List<CustomerWithSalesDto> getTotalSalesByCustomer();
}
