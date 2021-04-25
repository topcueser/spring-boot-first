package com.esertopcu.shop.mappers;

import com.esertopcu.shop.dtos.ProductTypeDto;
import com.esertopcu.shop.entities.ProductType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {

    ProductTypeDto productTypeDto(ProductType productType);

    ProductType dtoToEntity(ProductTypeDto productTypeDto);
}
