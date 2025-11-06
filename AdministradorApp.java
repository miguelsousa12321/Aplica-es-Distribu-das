package app;

import java.rmi.*;
import java.rmi.registry.*;
import banco.*;
public class AdministradorApp {

    public static void main(String[] args) {
        try {
            BancoSangueInterface banco = (BancoSangueInterface) Naming.lookup("rmi://localhost:1099/BancoSangue");
            // Operações do administrador


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("QUALQUER CENA EFFHEIHGHG")
        }
    }
}  