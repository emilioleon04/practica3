import java.util.ArrayList;
import java.util.Scanner;

import practicapoo.Account;

public class App {
    public static void main(String[] args) {

        Account account = new Account(0, 100);
        Account account1 = new Account(1, 100);
        Account account2 = new Account(2, 100);
        Account account3 = new Account(3, 100);
        Account account4 = new Account(4, 100);
        Account account5 = new Account(5, 100);
        Account account6 = new Account(6, 100);
        Account account7 = new Account(7, 100);
        Account account8 = new Account(8, 100);
        Account account9 = new Account(9, 100);

        
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(account);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        accounts.add(account6);
        accounts.add(account7);
        accounts.add(account8);
        accounts.add(account9);

        while (true) {
        System.out.println("Ingresa el ID de la cuenta (0-9): ");
        System.out.println("Ingresa 10 para salir.");
        try {
        int id = new java.util.Scanner(System.in).nextInt();

        if (id == 10) {
            System.out.println("Saliendo del ATM...");
            break;
        }

        Account selectedAccount = accounts.get(id);

        System.out.println("Menú de opciones:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");
        int option;
        do {
            System.out.print("Selecciona una opción (1-4): ");
            option = new java.util.Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    System.out.println("Saldo actual: " + selectedAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a retirar: ");
                    double withdrawAmount = new java.util.Scanner(System.in).nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                    System.out.println("Nuevo saldo: " + selectedAccount.getBalance());
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad a depositar: ");
                    double depositAmount = new java.util.Scanner(System.in).nextDouble();
                    selectedAccount.deposit(depositAmount);
                    System.out.println("Nuevo saldo: " + selectedAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (option != 4);  
        
            } catch (IndexOutOfBoundsException e) {
            System.out.println("ID inválido. Por favor ingresa un ID entre 0 y 9.");
            }
        }
    }
}
