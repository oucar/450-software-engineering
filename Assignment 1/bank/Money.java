package Assignment1.bank;

public class Money {

  double balance;

  public Money(double amount) {
    balance = amount;
  }

  public double withdraw(double amount) {
    balance -= amount;
    return balance;
  }

  public double deposit(double amount) {
    balance += amount;
    return balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }
}
