package com.example.EMICalculator.Model;

// Model class to get the request input for EMI calculation

public class EMICalculatorRequest {

    private double amount;
    private double interest;
    private double period;

    // Default Constructor
    public EMICalculatorRequest() {
    }

    // Parameterized Constructor
    public EMICalculatorRequest(double amount, double interest, double period) {
        this.amount = amount;
        this.interest = interest;
        this.period = period;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public double getInterest() {
        return interest;
    }

    public double getPeriod() {
        return period;
    }

    // Setters
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setPeriod(double period) {
        this.period = period;
    }
}
