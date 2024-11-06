package br.com.fehfito.java.exercises.bankaccount;

import java.util.Scanner;

public class BankAccount {

    private double initialBalance;
    protected double balance;
    private double value;
    Scanner read = new Scanner(System.in);

    public BankAccount(double initialBalance) {
        this.initialBalance = initialBalance;
        this.balance = initialBalance;
    }

    public void deposit() {
        System.out.print("Insira o valor para depósito: ");
        value = read.nextDouble();
        balance += value;
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$" + balance);
    }

    public void withdraw() {
        System.out.print("Insira o valor para saque: ");
        value = read.nextDouble();
        if (value <= balance) {
            balance -= value;
            System.out.println("Saque realizado com sucesso! Saldo atual: R$" + balance);
        } else {
            System.out.println("O saldo não é suficiente!");
        }
    }

    public void checkBalance() {
        System.out.println("O saldo é de R$" + balance);
    }
}