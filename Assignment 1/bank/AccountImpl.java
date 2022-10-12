package Assignment1.bank;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Assignment1.common.Account;
import Assignment1.bank.Money;

public class AccountImpl extends UnicastRemoteObject implements Account
{
    String name;
    Money balance;

    public AccountImpl() throws RemoteException {
        super();
        name = "";
        balance = new Money(0);
    }

    public void withdraw(double amount) {
        double newbalance = balance.withdraw(amount);
        System.out.println("New Balance: " + newbalance);
    }

    public void deposit(double amount) {
        double newbalance = balance.deposit(amount);
        System.out.println("New Balance: " + newbalance);
    }

    public double getBalance() {
        return balance.getBalance();
    }

    public void setBalance(double newBalance) {
        balance.setBalance(newBalance);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}