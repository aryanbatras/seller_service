package com.sashel.seller_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(SellerNotFoundException.class)
  public ResponseEntity<String> handleSellerNotFoundException(SellerNotFoundException e) {
    return ResponseEntity.status(
            HttpStatus.NOT_FOUND
    ).body(
            e.getMessage()
    );
  }
}
