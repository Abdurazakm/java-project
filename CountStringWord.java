import java.util.Scanner;

public class CountStringWord {
    String stringword;

    public CountStringWord(String strword) {
        stringword = strword;
    }

    public void countWord() {
        // Trim leading and trailing spaces and split the string by spaces
        stringword=stringword.trim();
        String[] words = stringword.split("\\s+");
        int count = words.length;

        // Handle the case of an empty string
        if (stringword.trim().isEmpty()) {
            count = 0;
        }

        System.out.println("The number of words in the string \"" + stringword + "\" is " + count +" words");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String strword = scanner.nextLine();

        CountStringWord obj = new CountStringWord(strword);
        obj.countWord();
    }
}
