package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data

@Schema(
        name = "Accounts",
        description = "Schema to hold Account details"
)
public class AccountsDto {

    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Account number must be 10 digits")

    @Schema(
            description = "Account number of eazy bank account",
            example = "1234567890"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type can not be null or empty")
    @Schema(
            description = "Account type of eazy bank account",
            example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address can not be null or empty")
    @Schema(
            description = "Branch address of eazy bank account",
            example = "123, Pune"
    )
    private String branchAddress;
}
