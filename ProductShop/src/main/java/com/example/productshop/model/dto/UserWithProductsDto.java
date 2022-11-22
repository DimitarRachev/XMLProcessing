package com.example.productshop.model.dto;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWithProductsDto {
  private String firstName;
  private String lastName;
  private Integer age;
  public AllSoldProductsDto soldProducts;

  public UserWithProductsDto(UserWithProductsDto user) {
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName();
    this.age = user.getAge();
    this.soldProducts = new AllSoldProductsDto(user.soldProducts.getProducts());
  }
}
