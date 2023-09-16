package com.trade.model;

public class ExchaneCurrency {

	private String from;
	private String to;
	private String ccy;
	private double amount;
	
	public ExchaneCurrency() {
		// TODO Auto-generated constructor stub
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ExchaneCurrency [from=" + from + ", to=" + to + ", ccy=" + ccy + ", amount=" + amount + "]";
	}
	
	
	
	
	
}
