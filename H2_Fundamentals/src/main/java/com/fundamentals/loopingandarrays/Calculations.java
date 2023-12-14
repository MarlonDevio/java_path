package com.fundamentals.loopingandarrays;

public class Calculations {
    private double amount;
    private double rate;
    private int years;

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Calculations(double amount, double rate, int years){
        this.amount = amount;
        this.rate = rate;
        this.years=years;
    }

    public double calculateInterest(double amount, double rate, int years){
       return amount * rate * years;
    }

    public double[] produceInterestHistory(double amount, double rate,
                                           int years){
        double[] accumulatedInterest = new double[years];
        for (int yearIndex = 0; yearIndex<years; yearIndex++){
            int year = yearIndex+1;
            accumulatedInterest[yearIndex] = calculateInterest(amount, rate,
                    years);
        }
        return accumulatedInterest;
    }
}
