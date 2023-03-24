package de.claudioaltamura.springbootvalidationrecordlombok;

import de.claudioaltamura.springbootvalidationrecordlombok.controller.ProductNumber;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    public Optional<Product> findProductByNumber(ProductNumber productNumber) {
        return switch (productNumber.number()) {
            case "A1" -> Optional.of(Product.builder().id("4070171967072").productNumber("A1").name("A1").description("A A1 product").note("blabla").build());
            case "A2" -> Optional.of(Product.builder().id("4070271967072").productNumber("A2").name("A2").description("A A2 product").note("blabla").build());
            case "A3" -> Optional.of(Product.builder().id("4070371967072").productNumber("A3").name("A3").description("A A3 product").note("blabla").build());
            default -> Optional.ofNullable(null);
        };
    }
}
