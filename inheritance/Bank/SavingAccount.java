package inheritance.Bank;

public class SavingAccount extends BankAccount {
    private double interestRate;
    SavingAccount(String owner, double balance, double interestRate){
        super(owner, balance);
        this.interestRate = interestRate ;
    }
    void payInterest(){
        double interest = balance * interestRate/100;
        deposit(interest);
        System.out.println("interest paid: " + interest);
    }
    void setinterest(double interestRate){
        this.interestRate = interestRate;
        System.out.println("interest rate set to: " + interestRate + "%");

    }
    
}
