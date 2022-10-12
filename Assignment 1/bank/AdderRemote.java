package Assignment1.bank;

import Assignment1.common.Adder;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {

  AdderRemote() throws RemoteException {
    super();
  }

  public double add(double x, double y) {
    System.out.println(
      "AddRemote server: got request from client to add numbers " +
      x +
      " and " +
      y
    );
    System.out.println("Adding remotely in server");
    System.out.println("-----------------------------------");
    return x + y;
  }
}
