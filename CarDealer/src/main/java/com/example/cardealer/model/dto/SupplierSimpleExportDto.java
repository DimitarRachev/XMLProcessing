package com.example.cardealer.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierSimpleExportDto {
  private Long id;
  private String name;
  private Long partsCount;
}
