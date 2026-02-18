package com.example.EMICalculator.Service;

import org.springframework.stereotype.Service;

@Service
public class EMICalculatorService {

    public double calculateEMI(double amount, double annualInterestRate, double periodInMonths) {

        // Convert annual interest rate to monthly rate
        double monthlyInterestRate = annualInterestRate / (12 * 100);

        // EMI Formula
        double emi = (amount * monthlyInterestRate * 
                     Math.pow(1 + monthlyInterestRate, periodInMonths)) /
                     (Math.pow(1 + monthlyInterestRate, periodInMonths) - 1);

        return emi;
    }
}
