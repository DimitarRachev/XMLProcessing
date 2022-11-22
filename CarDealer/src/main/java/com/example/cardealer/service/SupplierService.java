package com.example.cardealer.service;

import java.util.Collection;
import java.util.List;

import com.example.cardealer.model.dto.SupplierSimpleExportDto;
import com.example.cardealer.model.entity.Supplier;


public interface SupplierService {
   void save(Supplier supplier);

  long count();
  Supplier getRandomSupplier();

  List<SupplierSimpleExportDto> getLocalSuppliers();
}
