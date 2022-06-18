package com.cerata.userbackend.bean.requests;

import com.cerata.userbackend.validators.ValidDateOfBirth;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    @NotNull
    @Size(min = 2, max = 50)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 50)
    private String lastName;

    @NotNull
    @Pattern(regexp = "(male|female)", flags = Pattern.Flag.CASE_INSENSITIVE)
    private String gender;

    @Pattern(regexp = "\\d{1,2}/\\d{1,2}/\\d{4}")
    @ValidDateOfBirth
    private String dateOfBirth;

    private String city;

    @NotNull
    @Pattern(regexp = "01\\d{9}")
    private String phone;

    @NotNull
    @Email
    private String email;
}
