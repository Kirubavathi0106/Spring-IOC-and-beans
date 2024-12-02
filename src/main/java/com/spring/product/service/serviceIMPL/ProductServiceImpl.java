package com.spring.product.service.serviceIMPL;

import com.spring.product.Repository.ProductRepository;
import com.spring.product.entity.Product;
import com.spring.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(String Category) {
        return productRepository.findByCategory(Category);
    }
}

