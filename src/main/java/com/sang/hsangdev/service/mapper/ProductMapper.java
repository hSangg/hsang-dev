package com.sang.hsangdev.service.mapper;

import com.sang.hsangdev.domain.Product;
import com.sang.hsangdev.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
}
