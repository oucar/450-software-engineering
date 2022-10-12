package Assignment1.common;

import java.rmi.*;

public interface Account extends Remote {
  public void withdraw(double amount);

  public void deposit(double amount);

  public double getBalance();

  public void setBalance(double newBalance);

  public String getName();

  public void setName(String newName);
}
