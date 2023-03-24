package de.claudioaltamura.springbootvalidationrecordlombok.controller;

import de.claudioaltamura.springbootvalidationrecordlombok.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("products")
@Tag(name = "products", description = "Products API")
public class ProductController {

    private final ProductService productService;
    @Operation(summary = "Search for products based on product numbers", tags = "products")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductResponse> getProducts(
            @RequestParam final @Size(min = 1, max = 10) List<ProductNumber> productNumbers) {
        return productNumbers.stream().map(productService::findProductByNumber)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(ProductMapper::mapToRespone)
                .collect(Collectors.toList());
    }

}