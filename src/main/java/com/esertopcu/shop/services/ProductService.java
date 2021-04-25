package com.esertopcu.shop.services;

import com.esertopcu.shop.dtos.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts();

    ProductDto getProduct(Long id);

}
