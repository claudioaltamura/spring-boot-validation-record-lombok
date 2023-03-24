package de.claudioaltamura.springbootvalidationrecordlombok;

import lombok.Builder;

@Builder
public record Product(String id, String productNumber, String name, String description, String note) {
}
