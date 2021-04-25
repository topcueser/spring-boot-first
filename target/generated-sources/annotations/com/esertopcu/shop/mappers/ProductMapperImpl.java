package com.esertopcu.shop.mappers;

import com.esertopcu.shop.dtos.ProductDto;
import com.esertopcu.shop.entities.Product;
import com.esertopcu.shop.entities.ProductBrand;
import com.esertopcu.shop.entities.ProductType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-25T12:54:09+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto entityToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setProductType( productProductTypeName( product ) );
        productDto.setProductBrand( productProductBrandName( product ) );
        productDto.setId( product.getId() );
        productDto.setName( product.getName() );
        productDto.setDescription( product.getDescription() );
        productDto.setPrice( product.getPrice() );
        productDto.setPictureUrl( product.getPictureUrl() );

        return productDto;
    }

    @Override
    public List<ProductDto> toProductDtos(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( entityToDto( product ) );
        }

        return list;
    }

    private String productProductTypeName(Product product) {
        if ( product == null ) {
            return null;
        }
        ProductType productType = product.getProductType();
        if ( productType == null ) {
            return null;
        }
        String name = productType.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String productProductBrandName(Product product) {
        if ( product == null ) {
            return null;
        }
        ProductBrand productBrand = product.getProductBrand();
        if ( productBrand == null ) {
            return null;
        }
        String name = productBrand.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
