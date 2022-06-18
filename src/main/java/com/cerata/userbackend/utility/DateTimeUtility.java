package com.cerata.userbackend.utility;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtility {
    private static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";
    private static final String DEFAULT_TIME_ZONE = "BST";
    private static final DateTimeFormatter defaultDateFormatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);

    public static ZonedDateTime parseDate(String dateString) {
        return ZonedDateTime.parse(dateString, defaultDateFormatter);
    }

    public static ZonedDateTime getCurrentDate() {
        return ZonedDateTime.now(ZoneId.of(DEFAULT_TIME_ZONE));
    }

    public static ZonedDateTime getDatePastYears(ZonedDateTime referenceDateTime, long pastYears) {
        return referenceDateTime.minusYears(pastYears);
    }

    public static boolean isDateInRange(
            ZonedDateTime referenceDateTime,
            ZonedDateTime oldestDateTime,
            ZonedDateTime newestDateTime
    ) {
        boolean isPostOldest = referenceDateTime.isAfter(oldestDateTime) || referenceDateTime.isEqual(oldestDateTime);
        boolean isPreNewest = referenceDateTime.isBefore(newestDateTime) || referenceDateTime.isEqual(newestDateTime);

        return isPostOldest && isPreNewest;
    }
}
