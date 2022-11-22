package com.example.cardealer.model.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "suppliers")
public class SupplierImportWrapperDto {
//  @XmlRootElement(name = "supplier")
  @XmlElementWrapper(name = "suppliers")
  private List<SupplierImportDto> suppliers;

  public SupplierImportWrapperDto() {
    suppliers = new ArrayList<>();
  }
}
