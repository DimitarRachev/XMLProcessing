package com.example.productshop.service;

import java.util.List;

import com.example.product_shop.model.dto.ProductExportDto;
import com.example.product_shop.model.entity.Product;

public interface ProductService {
  void save(Product product);

  long count();

  List<ProductExportDto> findAllWithPriceBetweenWithNoSeller(double lowerBound, double upperBound);
}
