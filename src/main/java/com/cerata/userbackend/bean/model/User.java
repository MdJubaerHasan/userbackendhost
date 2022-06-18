package com.cerata.userbackend.bean.model;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String city;
    private String phone;
    private String email;
}
