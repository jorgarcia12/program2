package cuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cuentaAhorros ca = new cuentaAhorros(150000.00, 87.2,true);

        ca.activateAccount();

        System.out.print("Ingrese el dinero que quiere consignar: ");
        double amount = sc.nextDouble();

        ca.consign(amount);

        System.out.println("Ingrese el dinero que quiere retirar: ");
        amount = sc.nextDouble();

        ca.withdraw(amount);

        ca.calculateInterest();

        ca.monthlyStatement();

        ca.print();


    }
}

