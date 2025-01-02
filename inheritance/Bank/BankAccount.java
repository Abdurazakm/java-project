package inheritance.Bank;

public class BankAccount {
    String owner;
    double balance;
    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    void report(){
        System.out.println("Balance: " + balance);
    }
    boolean withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "withdraw. New balance: " + balance);
            return true;
        }
        else{
            System.out.println("insufficient balance");
            return false;
        }
    }
    
}
