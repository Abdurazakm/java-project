package exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalAge {
    private LocalDate birthDate;
    private LocalDate currentDate;

    // Mutator to set birthDate and currentDate
    public void setDates(String birthDateStr, String currentDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            birthDate = LocalDate.parse(birthDateStr, formatter);
            currentDate = LocalDate.parse(currentDateStr, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use dd-MM-yyyy.");
        }
    }

    // Method to calculate age in years and months
    public double calculateAge() {
        if (birthDate.isAfter(currentDate)) {
            throw new IllegalArgumentException("Birth date cannot be after the current date.");
        }
        Period period = Period.between(birthDate, currentDate);
        return period.getYears() + (period.getMonths() / 12.0);
    }

    // Method to validate the date of birth
    public boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

