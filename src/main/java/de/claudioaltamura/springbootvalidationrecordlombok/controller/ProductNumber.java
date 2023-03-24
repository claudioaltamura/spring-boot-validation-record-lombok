package de.claudioaltamura.springbootvalidationrecordlombok.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

@Builder
@Schema(description = "Representation of a product number")
public record ProductNumber(
        @NotEmpty
        @Schema(description = "product number", example = "A1", requiredMode = Schema.RequiredMode.REQUIRED)
        String number

) {

}
