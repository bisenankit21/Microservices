package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "Ankit Bisen"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "Name must be between 5 and 30 characters")
    private String name;


    @Schema(
            description = "Email of the customer",
            example = "bisenankit21@gmail.com"
    )
    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Invalid email format")
    private String email;


    @Schema(
            description = "Mobile Number of the customer",
            example = "1234567890"
    )
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobileNumber;


    @Schema(
            description = "Account Details of the customer"
    )
    private AccountsDto accountsDto;
}
