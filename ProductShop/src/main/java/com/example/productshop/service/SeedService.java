package com.example.productshop.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface SeedService {
 default void seedAll() throws IOException {
   seedUsers();
   seedCategories();
   seedProducts();
 }

void seedCategories() throws FileNotFoundException;
void seedProducts() throws FileNotFoundException;
void seedUsers() throws IOException;
}