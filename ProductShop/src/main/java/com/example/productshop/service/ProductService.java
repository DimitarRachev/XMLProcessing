package com.example.productshop.service;

import java.util.List;

import com.example.productshop.model.dto.ProductExportDto;
import com.example.productshop.model.entity.Product;


public interface ProductService {
  void save(Product product);

  long count();

  List<ProductExportDto> findAllWithPriceBetweenWithNoSeller(double lowerBound, double upperBound);
}
