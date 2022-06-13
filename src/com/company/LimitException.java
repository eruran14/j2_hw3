package com.company;

public class LimitException extends Exception{
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
