package com.sang.hsangdev.controller;

import com.sang.hsangdev.dto.ProductDTO;
import com.sang.hsangdev.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String getProduct() {
        return "✨ get successfully";
    }

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        var result = productService.addProduct(productDTO);

        return ResponseEntity.ok(result);
    }
}
