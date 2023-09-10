package com.finzly.FxTrading.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.FxTrading.Model.FXTrade1;

@RestController

public class FXTradeController {

	private static int tradeCounter = 1;

	private static List<FXTrade1> trades = new ArrayList<>();

	@PostMapping("/bookTrade")
	public ResponseEntity<String> bookTrade(@RequestBody FXTrade1 trade) {
		if (isValidTrade(trade)) {
			double INRamount = trade.getAmount() * trade.getRate();

			trade.setINR_Amount(INRamount);
			trade.setTradeNo(tradeCounter++);
			trades.add(trade);
			return ResponseEntity.ok("Trade booked successfully");
		} else {
			return ResponseEntity.badRequest().body("Invalid trade details");
		}
	}

	@GetMapping("/getAll")
	public List<FXTrade1> listTrades() {
		return trades;
	}

	private boolean isValidTrade(FXTrade1 trade) {
		return isValidName(trade.getCustomerName()) && "USDINR".equals(trade.getCurrencyPair())
				&& trade.getAmount() > 0;
	}

	private boolean isValidName(String name) {
		String regex = "^[a-zA-Z\\s]+$";
		return name != null && name.matches(regex);
	}
}
