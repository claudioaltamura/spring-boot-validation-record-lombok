package de.claudioaltamura.springbootvalidationrecordlombok.controller;

import de.claudioaltamura.springbootvalidationrecordlombok.Product;

class ProductMapper {

    private ProductMapper(){};
    static ProductResponse mapToRespone(Product product) {
         return ProductResponse
                 .builder()
                 .productNumber(product.productNumber())
                 .id(product.id())
                 .name(product.name())
                 .description(product.description())
                 .build();
    }
}
