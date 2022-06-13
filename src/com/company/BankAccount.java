package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum){
        return this.amount = amount + sum;
    }

    public int withdraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("На вашем счету недостаточно средств. Остаток на счету: ", getAmount());
        }
        return (int)(this.amount = amount - sum);
    }
}
