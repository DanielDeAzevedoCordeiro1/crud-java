package com.daniel.authapi.services;

import com.daniel.authapi.dto.ProductRequestDTO;
import com.daniel.authapi.model.Product;
import com.daniel.authapi.repository.ProductRepository;
import com.daniel.authapi.util.ProductFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(ProductRequestDTO productRequestDTO) {
       var product = ProductFactory.createProduct(productRequestDTO);
       return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByCategory(String productCategory) {
        return productRepository.findByCategory(productCategory);
    }

}
