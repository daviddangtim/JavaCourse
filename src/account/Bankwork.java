package account;

public class Bankwork{

  // State variables
  private long balance = 0;  // recorded in pennies.

  private String name = "No Name!";
  
  private String password = "password";
  
  private double interestRate = 0; // Note that 5% is recorded as 0.05 internally!!

// Constructors
  private void BankAccount() {
    // If you make the default constructor private, you disallow anyone from
    // making an account w/o the proper information.
  }
  

  public void BankAccount(String aName, String aPassword, double initialBalance, double interest) {
    if( initialBalance > 0)
      balance = (long)(initialBalance * 100);
    name = aName;
    password = aPassword;
    if( interest > 0)
      interestRate = interest / 100;
  }

// Getters and setters

  public double getBalance() { return( balance / 100.0);}

  public String getName() { return( name);}

  public double getInterestRate() { return( interestRate);}

  public String getPassword() { return( password);}

  public void setPassword( String aNewPassword) { password = aNewPassword;}
  
// Other functions

  public void credit( double money) {
    balance += money * 100;
  }

  public void debit( double money) {
    if( (money * 100) > balance) {
      System.out.println(" You can't take out that much money");
    }
    else {
      balance -= money * 100;
    }
  }

  public double monthlyUpdate() {
  	double interestPaid = balance * ( interestRate / 12);
    balance += interestPaid;
    return( interestPaid / 100);
  }
  

  public String toString() {
    String s = "The balance of " + name + "'s account is # " + (balance /100);
    s += "." + (balance % 100) + ".";
    return( s);
  }
}
