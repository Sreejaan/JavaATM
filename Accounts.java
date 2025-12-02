import java.util.List;
import java.util.ArrayList;

public class Accounts {
  private int AccountNumber;
  private int PIN;
  private String Name;
  private String MobileNumber;
  private double Balance;
  List<String> transactionHistory;

  Accounts(int AccountNumber, int PIN, String Name, String MobileNumber, double Balance){
    this.AccountNumber = AccountNumber;
    this.PIN = PIN;
    this.Name = Name;
    this.MobileNumber = MobileNumber;
    this.Balance = Balance;
    this.transactionHistory = new ArrayList<>();
  }
  public int getPIN(){ return this.PIN;}

  public double checkBalance(){ return this.Balance;}

  public boolean withDraw(double amount){
    if(amount >= this.Balance)return false;
    this.Balance -= amount;
    this.transactionHistory.add("Withdrawn: " + amount);
    return true;
  }

  public void changeMobileNumber(String newMobileNumber){
    this.MobileNumber = newMobileNumber;
    this.transactionHistory.add("Mobile updated to " + newMobileNumber);
}

public void changePIN(int newPIN){
    this.PIN = newPIN;
    this.transactionHistory.add("PIN changed.");
}


  public void deposit(double amount){
    if(amount <= 0) return;
    this.Balance += amount;
    this.transactionHistory.add("Deposited: " + amount);
  }

  public void printTransactionHistory(){
    System.out.println("Transaction History for Account Number: " + this.AccountNumber);
    for(String transaction : this.transactionHistory){
      System.out.println(transaction);
    }
  }
}
