package com.finzly.FxTrading.Model;

import org.springframework.stereotype.Component;

@Component
public class FXTrade1 {
	private int tradeNo;
	private String currencyPair;
	private String customerName;
	private double amount;
	private static double rate = 66.00;
	private double INR_Amount;

	FXTrade1() {

	}

	public FXTrade1(int tradeNo, String currencyPair, String customerName, double amount, double rate,
			String INR_Amount) {
		this.tradeNo = tradeNo;
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

	public double getINR_Amount() {
		return INR_Amount;
	}

	public void setINR_Amount(double iNR_Amount) {
		INR_Amount = iNR_Amount;
	}

	public void setTradeNo(int tradeNo) {
		this.tradeNo = tradeNo;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
