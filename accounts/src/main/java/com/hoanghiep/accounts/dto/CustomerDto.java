package com.hoanghiep.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be none or empty")
    @Size(min = 5, max = 30, message = "Name must be between 5 and 30 characters")
    private String name;

    @NotEmpty(message = "Email address cannot be none or empty")
    @Email(message = "Email is not valid")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number is not valid, should be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
