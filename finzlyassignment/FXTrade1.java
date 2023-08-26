package com.finzlyassignment;

public class FXTrade1 {
    private static int tradeCounter = 1;

    private int tradeNo;
    private String currencyPair;
    private String customerName;
    private double amount;
    private double rate;

    public FXTrade1(String currencyPair, String customerName, double amount, double rate) {
        this.tradeNo = tradeCounter++;
        this.currencyPair = currencyPair;
        this.customerName = customerName;
        this.amount = amount;
        this.rate = rate;
    }

    public int getTradeNo() {
        return tradeNo;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }
}

