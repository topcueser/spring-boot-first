package com.esertopcu.shop.mappers;

import com.esertopcu.shop.dtos.ProductDto;
import com.esertopcu.shop.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "productType", source = "product.productType.name")
    @Mapping(target = "productBrand", source = "product.productBrand.name")
    ProductDto entityToDto(Product product);

    @Mapping(target = "productType", source = "product.productType.name")
    @Mapping(target = "productBrand", source = "product.productBrand.name")
    List<ProductDto> toProductDtos(List<Product> products);
}
