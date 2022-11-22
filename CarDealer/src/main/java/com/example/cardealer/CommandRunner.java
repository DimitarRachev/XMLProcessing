package com.example.cardealer;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.example.cardealer.model.dto.CarExportDto;
import com.example.cardealer.model.dto.CarWithPartsListDto;
import com.example.cardealer.model.dto.CustomerExportDto;
import com.example.cardealer.model.dto.CustomerWithSalesDto;
import com.example.cardealer.model.dto.SaleDetailsDto;
import com.example.cardealer.model.dto.SupplierSimpleExportDto;
import com.example.cardealer.service.CarService;
import com.example.cardealer.service.CustomerService;
import com.example.cardealer.service.SaleService;
import com.example.cardealer.service.SeedService;
import com.example.cardealer.service.SupplierService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CommandRunner implements CommandLineRunner {
  private final SeedService seedService;
  private final CustomerService customerService;
  private final SupplierService supplierService;
  private final SaleService saleService;
  private final CarService carService;

  @Override public void run(String... args) throws Exception {
    seedService.seedAll();
    //    orderedCustomers();
    //    getAllByMaker("Toyota");
    //    getLocalSuppliers();
    //    getCarsWithPartsList();
    //    getTotalSalesByCustomer();
//    getSalesWithDiscount();
  }

  private void getSalesWithDiscount() throws JAXBException {
    JAXBContext.newInstance(SaleDetailsDto.class)
      .createMarshaller()
      .marshal(saleService.getSalesWithDiscount(), System.out);
  }

  private void getTotalSalesByCustomer() throws JAXBException {
    JAXBContext.newInstance(CustomerWithSalesDto.class)
      .createMarshaller()
      .marshal(customerService.getTotalSalesByCustomer(), System.out);
  }

  private void getCarsWithPartsList() throws JAXBException {
    JAXBContext.newInstance(CarWithPartsListDto.class)
      .createMarshaller()
      .marshal(carService.getCarsWithPartsList(), System.out);
  }

  private void getLocalSuppliers() throws JAXBException {
    JAXBContext.newInstance(SupplierSimpleExportDto.class)
      .createMarshaller()
      .marshal(supplierService.getLocalSuppliers(), System.out);
  }

  private void getAllByMaker(String make) throws JAXBException {
    JAXBContext.newInstance(CarExportDto.class)
      .createMarshaller()
      .marshal(carService.getAllToyotas(make), System.out);
  }

  private void orderedCustomers() throws JAXBException {
    JAXBContext.newInstance(CustomerExportDto.class)
      .createMarshaller()
      .marshal(customerService.findAllOrderedByBirthDateAndYoung(), System.out);
  }
}
