package com.trade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CcyAlreadyExistsException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public ResponseEntity<String> ccyAlreadyExistsException(CcyAlreadyExistsException ex){
		return ResponseEntity.ok(ex.getMessage());
	}
	
	@ExceptionHandler(CcyNotValidException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity<String> ccyNotValidException(CcyNotValidException ex){
		return ResponseEntity.ok(ex.getMessage());
	}
	
	@ExceptionHandler(ExchangeDataNotExistsException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity<String> exchangeDataNotExistsException(ExchangeDataNotExistsException ex){
		return ResponseEntity.ok(ex.getMessage());
	}
}
