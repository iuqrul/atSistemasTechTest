package com.example.atsistemastechtest.services.impl;

import com.example.atsistemastechtest.openapitools.client.ApiClient;
import com.example.atsistemastechtest.openapitools.client.ApiException;
import com.example.atsistemastechtest.openapitools.client.api.DefaultApi;
import com.example.atsistemastechtest.openapitools.client.model.ProductDetail;
import com.example.atsistemastechtest.services.SimilarProducts;
import org.springframework.stereotype.Service;

@Service
public class SimilarProductsImpl implements SimilarProducts {

    private ApiClient apiclient;

    @Override
    public ProductDetail getProductProductId(String productId) {

        DefaultApi defaultApi = new DefaultApi(getApiclient());

        try {
            return defaultApi.getProductProductId(productId);
        } catch (ApiException e) {
            return null;
        }
    }

    public ApiClient getApiclient() {

        if (apiclient == null) {
            apiclient = new ApiClient();
        }

        return apiclient;
    }
}
