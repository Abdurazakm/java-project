public class Bank {
    int balance;
    void setbalance(int bal){
         balance=bal;
     }
     int deposite( int dep){
          balance=balance + dep;
         return balance;
     }
     int withdraw(int withd){
         balance=balance - withd;
         return balance;
     }
  
     public static void main(String arg[]){
        Bank cust1= new Bank();
        cust1.setbalance(1000);
        System.out.println("customer 1 balance after withdrawal "+ cust1.withdraw(300));
        System.out.println(" Customer 1 balance after depositing  "+ cust1.deposite(3000));
        Bank cust2= new Bank();
        cust2.setbalance(5000);
        System.out.println(" customer 2 balance after withdrawal  "+ cust2.withdraw(500));
        System.out.print(" customer 2 balance after depositing  "+ cust2.deposite(3000));

}
}
