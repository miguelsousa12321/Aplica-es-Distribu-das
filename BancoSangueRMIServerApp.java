package app;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import banco.*;



public class BancoSangueRMIServerApp {
    public static void main(String[] args) {
        try {

         Registry registry = LocateRegistry.getRegistry();

         registry.rebind("banco",new BancoSangue());
         

         System.out.println("RMI Server do Banco de Sangue started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}