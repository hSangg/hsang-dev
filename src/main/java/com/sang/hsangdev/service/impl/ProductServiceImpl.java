package com.sang.hsangdev.service.impl;

import com.sang.hsangdev.dto.ProductDTO;
import com.sang.hsangdev.repository.ProductRepository;
import com.sang.hsangdev.service.ProductService;
import com.sang.hsangdev.service.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductDTO addProduct(ProductDTO product) {
        var entity = productMapper.toEntity(product);
        entity = productRepository.save(entity);
        return productMapper.toDto(entity);
    }
}
