package com.patient.billing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PatientidExceptionHandler
{
	
	@ExceptionHandler(value = BillingIdNotFoundException.class)
	public ResponseEntity<String> exception(BillingIdNotFoundException patientIdException) {
		//log.error("ResourceNotFoundException-" + exception.getMessage(), exception);
		return new ResponseEntity<>(patientIdException.getMessage(), HttpStatus.NOT_FOUND);
	}

}
