package com.grupo3a.ecommercefrutos2.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Email not registered")
public class EmailNotRegisteredException extends RuntimeException {}
