// Base class for sports
class Sport {
    String name;
    int teamSize;

    // Constructor
    public Sport(String name, int teamSize) {
        this.name = name;
        this.teamSize = teamSize;
    }

    // Display common information
    public void displayInfo() {
        System.out.println("Sport: " + name + ", Team Size: " + teamSize);
    }
}

// Football class
class Football extends Sport {
    int goalsScored;

    public Football(int goalsScored) {
        super("Football", 11);
        this.goalsScored = goalsScored;
    }

    public void displayStatistics() {
        System.out.println(name + " - Goals Scored: " + goalsScored);
    }
}

// Basketball class
class Basketball extends Sport {
    int pointsScored;

    public Basketball(int pointsScored) {
        super("Basketball", 5);
        this.pointsScored = pointsScored;
    }

    public void displayStatistics() {
        System.out.println(name + " - Points Scored: " + pointsScored);
    }
}

// Tennis class
class Tennis extends Sport {
    int setsWon;

    public Tennis(int setsWon) {
        super("Tennis", 1);
        this.setsWon = setsWon;
    }

    public void displayStatistics() {
        System.out.println(name + " - Sets Won: " + setsWon);
    }
}

// Main class to demonstrate functionality
public class SportsStatistics {
    public static void main(String[] args) {
        Football football = new Football(5);
        Basketball basketball = new Basketball(89);
        Tennis tennis = new Tennis(3);

        football.displayInfo();
        football.displayStatistics();

        basketball.displayInfo();
        basketball.displayStatistics();

        tennis.displayInfo();
        tennis.displayStatistics();
    }
}
