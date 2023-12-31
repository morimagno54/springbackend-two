package com.grupo3a.ecommercefrutos2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Invalid credentials")
public class InvalidCredentialException extends RuntimeException {}
