package exercise;

public class JourMain {
    public static void main(String[] args) {
        // Creating a Journal object
        Journal journal = new Journal(
                "Alice Johnson",
                "innovative techniques in artificial intelligence",
                "15-10-2024"
        );

        // Display all journal details
        System.out.println("--- Journal Details ---");
        journal.displayDetails();

        // Get and display formatted title
        System.out.println("\nFormatted Title: " + journal.getSubmissionDetails());
    }
}
