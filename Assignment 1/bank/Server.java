package Assignment1.bank;

import Assignment1.common.Account;
import java.rmi.*;
import java.rmi.registry.*;

public class Server {

  public static void main(String args[]) {
    try {
      Account remote_obj = new AccountImpl();
      String name = "//in-csci-rrpc01:9876/RemoteAccount";
      Naming.rebind(name, remote_obj);
      System.out.println("Server is ready");
    } catch (Exception e) {
      System.out.println("Server err: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
