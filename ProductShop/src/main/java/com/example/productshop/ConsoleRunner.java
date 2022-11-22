package com.example.productshop;


import com.example.productshop.service.CategoryService;
import com.example.productshop.service.ProductService;
import com.example.productshop.service.SeedService;
import com.example.productshop.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ConsoleRunner implements CommandLineRunner {
  private final SeedService seedService;
  private final UserService userService;
  private final ProductService productService;
  private final CategoryService categoryService;

  @Override public void run(String... args) throws Exception {
    seedService.seedAll();
//    findAllProductsBetween(500.0, 1000.0);
//    findAllSuccessfullySellers();
//    categoriesByProductCount();
//    usersAndProducts();

  }

  private void usersAndProducts() {
//    userService
//      .getUsersAndProducts()
//      .stream()
//      .map(gson::toJson)
//      .forEach(System.out::println);
//    System.out.println(gson.toJson(userService.getUsersAndProducts()));
  }

  private void categoriesByProductCount() {
    categoryService
      .findAllByProductCount()
      .stream()
//      .map(gson::toJson)
      .forEach(System.out::println);

  }

  private void findAllSuccessfullySellers() {
    userService
      .findAllSuccessfullySellers()
      .stream()
//      .map(gson::toJson)
      .forEach(System.out::println);
  }

  private void findAllProductsBetween(Double lowerBound, Double upperBound) {
    productService.findAllWithPriceBetweenWithNoSeller(lowerBound, upperBound)
      .stream()
//      .map(gson::toJson)
      .forEach(System.out::println);
  }
}
