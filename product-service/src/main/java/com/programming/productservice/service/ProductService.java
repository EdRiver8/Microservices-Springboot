package com.programming.productservice.service;

import com.programming.productservice.dto.ProductRequest;
import com.programming.productservice.dto.ProductResponse;
import com.programming.productservice.model.Product;

import java.util.List;

public interface ProductService {
    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();
}
