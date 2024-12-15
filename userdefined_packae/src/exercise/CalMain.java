package exercise;

public class CalMain {
    public static void main(String[] args) {
        CalAge ageCalculator = new CalAge();

        // Setting valid dates
        String birthDate = "15-05-1998";
        String currentDate = "26-11-2024";

        // Validate the birth date
        if (!ageCalculator.isValidDate(birthDate)) {
            System.out.println("Invalid birth date!");
            return;
        }

        // Set dates and calculate age
        ageCalculator.setDates(birthDate, currentDate);
        System.out.println("Age in years and months: " + ageCalculator.calculateAge());
    }
}

