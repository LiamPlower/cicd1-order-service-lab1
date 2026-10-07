package com.example.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "http://localhost:8081")
public interface CatalogClient
{
    @GetMapping("/products/{id}")
    String getproductById(@PathVariable("id") Long id);
}
