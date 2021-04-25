package com.esertopcu.shop.services.impl;

import com.esertopcu.shop.dtos.ProductDto;
import com.esertopcu.shop.entities.Product;
import com.esertopcu.shop.mappers.ProductMapper;
import com.esertopcu.shop.repositories.ProductRepository;
import com.esertopcu.shop.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> getProducts() {
        List<Product> products = repository.findAll();
        return productMapper.toProductDtos(products);
    }

    @Override
    public ProductDto getProduct(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return productMapper.entityToDto(product);
    }
}
