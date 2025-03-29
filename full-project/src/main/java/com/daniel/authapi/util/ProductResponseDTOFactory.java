package com.daniel.authapi.util;

import com.daniel.authapi.dto.ProductResponseDTO;
import com.daniel.authapi.model.Product;

public class ProductResponseDTOFactory {

    public static ProductResponseDTO create(Product product) {
        return new ProductResponseDTO(product.getName(),product.getDescription(),product.getPrice(),product.getCategory());
    }
}
