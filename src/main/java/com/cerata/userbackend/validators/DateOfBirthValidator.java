package com.cerata.userbackend.validators;

import com.cerata.userbackend.utility.DateTimeUtility;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.ZonedDateTime;

public class DateOfBirthValidator implements ConstraintValidator<ValidDateOfBirth, String> {
    @Override
    public boolean isValid(String dateOfBirth, ConstraintValidatorContext context) {
        ZonedDateTime givenDateOfBirth = DateTimeUtility.parseDate(dateOfBirth);
        ZonedDateTime newestPossibleDate = DateTimeUtility.getCurrentDate();
        ZonedDateTime oldestPossibleDate = DateTimeUtility.getDatePastYears(newestPossibleDate, 100);
        return DateTimeUtility.isDateInRange(givenDateOfBirth, oldestPossibleDate, newestPossibleDate);
    }
}
