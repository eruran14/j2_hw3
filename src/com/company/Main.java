package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount = new BankAccount();
    bankAccount.deposit(20000);

    while (true){
        try {
            bankAccount.withdraw(6000);
            System.out.println("Со счета снято 6000. Остаток: " + bankAccount.getAmount());
        }catch (LimitException le){
            try {
                bankAccount.withdraw((int)(bankAccount.getAmount()));
            } catch (LimitException e) {
                System.out.println(e.getMessage() + bankAccount.getAmount());
            }
            System.out.println(le.getMessage() + bankAccount.getAmount());
            break;
        }
    }
    }
}
