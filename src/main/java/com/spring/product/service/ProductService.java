package com.spring.product.service;

import com.spring.product.entity.Product;
import java.util.List;

public interface ProductService {
    void saveProduct(Product product);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
}