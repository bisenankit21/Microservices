package com.example.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(name = "Cards",
        description = "Schema to hold Cards details")
public class CardsDto {

    @NotEmpty(message = "Card Number must not be empty or null")
    @Pattern(regexp = "^$|[0-9]{12}", message = "Card number must be 12 digits")

    @Schema(
            description = "Card number of eazy bank account",
            example = "12345678901234"
    )
    private String cardNumber;

    @NotEmpty(message = "Mobile Number must not be empty or null")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number must be 10 digits")

    @Schema(
            description = "Mobile number of card Holder",
            example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card Type must not be empty or null")
    @Schema(
            description = "Card type of eazy bank account",
            example = "Credit/Savings"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total limit of eazy bank account",
            example = "10000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    @Schema(
            description = "Amount used of eazy bank account",
            example = "5000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Available amount of eazy bank account",
            example = "5000"
    )
    private int availableAmount;

}
