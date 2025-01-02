package inheritance.Bank;

public class Main {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount("Abdurazak", 5000, 0);
        CheckingAccount checking = new CheckingAccount("Abdularazak", 1000, saving);
        checking.withdraw(1200);
        checking.withdraw(500);
        saving.payInterest();
    }
    
}
