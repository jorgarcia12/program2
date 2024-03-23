package cuentaBancaria;

public class cuentaCorriente extends Cuenta {
    protected double overdraft = 0;

    public cuentaCorriente(double balance, double annualRate, double overdraft) {
        super(balance, annualRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            double remainingAmount = amount - balance;
            balance = 0;
            overdraft += remainingAmount;
        }
        numberWithdrawals++;
    }

    @Override
    public void consign(double amount) {
        balance += amount;
        if (overdraft > 0) {
            if (overdraft >= amount) {
                overdraft -= amount;
            } else {
                balance -= (amount - overdraft);
                overdraft = 0;
            }
        }
        numberConsignments++;
    }

    @Override
    public void monthlyStatement() {
        balance -= monthlyCommission;
        calculateInterest();
        overdraft = 0;
    }

    @Override
    public void print() {
        System.out.println("Saldo: " + balance);
        System.out.println("Comision mensual: " + monthlyCommission);
        System.out.println("Cantidad de transacciones realizadas: " + (numberWithdrawals + numberConsignments));
        System.out.println("Sobregiro: " + overdraft);
    }
}
