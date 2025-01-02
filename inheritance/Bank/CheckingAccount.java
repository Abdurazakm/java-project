package inheritance.Bank;

public class CheckingAccount extends BankAccount{
    SavingAccount linkedSavings;
    CheckingAccount(String owner, double balance, SavingAccount linkedSavings){
        super(owner, balance);
        this.linkedSavings = linkedSavings;
    }
    @Override
    boolean withdraw(double amount){
        if (balance >= amount) {
            return super.withdraw(amount);

        }
        else if(linkedSavings != null && linkedSavings.balance >= amount){
            System.out.println("insuficient balance in checking, withdraw form saving. ");
            return linkedSavings.withdraw(amount);
        }
        else{
            System.out.println("withdraw failed, insufficient fund in both account.");
            return false;
        }
    }
    
}
