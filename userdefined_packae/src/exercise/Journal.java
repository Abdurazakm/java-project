package exercise;

public class Journal {
    private String authorName;
    private String paperTitle;
    private String submissionDate;

    // Constructor
    public Journal(String authorName, String paperTitle, String submissionDate) {
        this.authorName = authorName;
        this.paperTitle = paperTitle;
        this.submissionDate = submissionDate;
    }

    // Method to display all details
    public void displayDetails() {
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + paperTitle);
        System.out.println("Submission Date: " + submissionDate);
    }

    // Method to return formatted title (capitalize each word)
    public String getSubmissionDetails() {
        String[] words = paperTitle.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();
        for (String word : words) {
            capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return capitalizedTitle.toString().trim();
    }
}

