package com.example.atsistemastechtest.services;

import com.example.atsistemastechtest.openapitools.client.model.ProductDetail;

public interface SimilarProducts {

    ProductDetail getProductProductId(String productId);

}
