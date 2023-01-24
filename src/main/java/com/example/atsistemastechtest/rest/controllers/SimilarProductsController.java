package com.example.atsistemastechtest.rest.controllers;

import com.example.atsistemastechtest.openapitools.client.model.ProductDetail;
import com.example.atsistemastechtest.services.SimilarProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimilarProductsController {

    @Autowired
    SimilarProducts similarProducts;

    @GetMapping("/product/{productId}/similar")
    public ResponseEntity getEcho(@PathVariable String productId) {

        ProductDetail result;

        if (productId.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        result = similarProducts.getProductProductId(productId);

        if (result == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }

    }
}
