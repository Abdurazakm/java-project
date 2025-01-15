package chaptEx.abstraction and encapsulation;

public class Main {
    public static void main(String[] args) {
        ATM myATM = new ATM(1000);

        myATM.checkBalance();  // Your balance is: 1000.0
        myATM.deposit(500);    // Deposited: 500
        myATM.withdraw(300);   // Withdrew: 300
        myATM.checkBalance();  // Your balance is: 1200.0
    }
}

