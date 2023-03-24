package de.claudioaltamura.springbootvalidationrecordlombok.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema(description = "Representation of a product")
public record ProductResponse(String id, String productNumber, String name, String description) {

}
