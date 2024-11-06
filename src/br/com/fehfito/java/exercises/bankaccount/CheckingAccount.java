package br.com.fehfito.java.exercises.bankaccount;

public class CheckingAccount extends BankAccount {

    private double monthlyFee;

    public CheckingAccount(double initialBalance, double monthlyFee) {
        super(initialBalance);
        this.monthlyFee = monthlyFee;
    }

    public void applyMonthlyFee() {
        if (balance >= monthlyFee) {
            balance -= monthlyFee;
            System.out.println("Desconto aplicado. Saldo atual: R$" + String.format("%.2f", balance));
        } else {
            System.out.println("Saldo insuficiente para aplicar o desconto!");
        }
    }
}