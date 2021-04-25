package com.esertopcu.shop.mappers;

import com.esertopcu.shop.dtos.ProductTypeDto;
import com.esertopcu.shop.entities.ProductType;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-25T12:54:09+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class ProductTypeMapperImpl implements ProductTypeMapper {

    @Override
    public ProductTypeDto productTypeDto(ProductType productType) {
        if ( productType == null ) {
            return null;
        }

        ProductTypeDto productTypeDto = new ProductTypeDto();

        productTypeDto.setId( productType.getId() );
        productTypeDto.setName( productType.getName() );

        return productTypeDto;
    }

    @Override
    public ProductType dtoToEntity(ProductTypeDto productTypeDto) {
        if ( productTypeDto == null ) {
            return null;
        }

        ProductType productType = new ProductType();

        productType.setId( productTypeDto.getId() );
        productType.setName( productTypeDto.getName() );

        return productType;
    }
}
