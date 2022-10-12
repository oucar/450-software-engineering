package Assignment1.client;

import Assignment1.common.Account;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class AccountClient {

  public static void main(String args[]) {
    try {
      Scanner readObj = new Scanner(System.in);
      String name = "//in-csci-rrpc01:9876/RemoteAccount";
      Account stub = (Account) Naming.lookup(name);
      System.out.println("Found server object, enter two numbers...");
      double n1, n2;
      n1 = readObj.nextDouble();
      n2 = readObj.nextDouble();
      System.out.println("Client calling server with " + n1 + " and " + n2);
      System.out.println("Got response back from server : " + stub.add(n1, n2));
    } catch (Exception e) {
      System.out.println("Client err : " + e.getMessage());
      e.printStackTrace();
    }
  }
}
