import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Login{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to IIT GN Banking System");
    Map<Integer, Accounts> accountsDB = new HashMap<>();

    int choice;
    do{
      System.out.println("Press 1 to Login");
      System.out.println("Press 2 to Register");
      System.out.println("For Exit Press 0");
      System.out.print("Enter your choice: ");

      choice = sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Enter you Account Number: ");
          int accountNumber = sc.nextInt();
          System.out.print("Enter your PIN: ");
          int pin = sc.nextInt();

          Accounts loggedAccount = accountsDB.get(accountNumber);

          if(loggedAccount != null && loggedAccount.getPIN() == pin){
            System.out.println("Login Successful!");
            userMenu(sc, loggedAccount);
          } else {
            System.out.println("Invalid Account Number or PIN.");
          }
          break;
        case 2:
          System.out.print("Enter your Name: ");
          String name = sc.next();
          System.out.print("Enter you mobile number: ");
          String mobileNumber = sc.next();
          System.out.print("Enter your initial balance: ");
          double initialBalance = sc.nextDouble();
          System.out.print("Enter you Account Number: ");
          int newAccountNumber = sc.nextInt();
          System.out.print("Set your PIN: ");
          int newPin = sc.nextInt();
          Accounts newAccount = new Accounts(newAccountNumber, newPin, name, mobileNumber, initialBalance);
          accountsDB.put(newAccountNumber, newAccount);
          System.out.println("Registration Successful! You can now login.");
          break;
      }
      
    }while(choice != 0);

    System.out.println("Thank you for using IIT GN Banking System!");
    sc.close();
    
  }


  public static void userMenu(Scanner sc, Accounts account){
    int option;

    do{
      System.out.println("\n===== User Menu =====");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit Money");
      System.out.println("3. Withdraw Money");
      System.out.println("4. Change Mobile Number");
      System.out.println("5. Change PIN");
      System.out.println("6. Transaction History");
      System.out.println("0. Logout");
      System.out.print("Choose option: ");

      option = sc.nextInt();
      switch(option){
        case 1:
          System.out.println("Current Balance: " + account.checkBalance());
          break;
        case 2:
          System.out.print("Enter amount to deposit: ");
          double depositAmount = sc.nextDouble();
          account.deposit(depositAmount);
          System.out.println("Deposited: " + depositAmount);
          break;
        case 3:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = sc.nextDouble();
          if(account.withDraw(withdrawAmount)){
            System.out.println("Withdrawn: " + withdrawAmount);
          } else {
            System.out.println("Insufficient Balance.");
          }
          break;
        case 4:
          System.out.print("Enter new mobile number: ");
          String newMobileNumber = sc.next();
          account.changeMobileNumber(newMobileNumber);
          System.out.println("Mobile number updated.");
          break;
        case 5:
          System.out.print("Enter new PIN: ");
          int newPIN = sc.nextInt();
          account.changePIN(newPIN);
          System.out.println("PIN changed successfully.");
          break;
        case 6:
          account.printTransactionHistory();
          break;
      }
    }while(option != 0);
    System.out.println("Logged out successfully.");
  }
}