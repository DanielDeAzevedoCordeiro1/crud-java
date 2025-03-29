package com.daniel.authapi.controller;

import com.daniel.authapi.dto.ProductRequestDTO;
import com.daniel.authapi.dto.ProductResponseDTO;
import com.daniel.authapi.model.Product;
import com.daniel.authapi.repository.ProductRepository;
import com.daniel.authapi.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        var newProduct = productService.save(productRequestDTO);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getAllProducts() {
        var productList = productService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String category) {
        var productList = productService.findByCategory(category);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
