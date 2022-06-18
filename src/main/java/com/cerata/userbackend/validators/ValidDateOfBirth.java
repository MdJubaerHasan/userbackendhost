package com.cerata.userbackend.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateOfBirthValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDateOfBirth {
    String message() default "Date Of Birth has to be in the range of (100 Years & today)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
