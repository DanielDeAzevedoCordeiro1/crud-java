package com.daniel.authapi.util;

import com.daniel.authapi.dto.ProductRequestDTO;
import com.daniel.authapi.model.Product;

public class ProductFactory {

    public static Product createProduct(ProductRequestDTO productRequestDTO) {
        return new Product(productRequestDTO.name(), productRequestDTO.description(), productRequestDTO.price(), productRequestDTO.category());
    }
}
