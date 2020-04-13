package com.password.validator.ms.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.password.validator.ms.model.Password;
import com.password.validator.ms.service.PasswordValidatorService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/password-validator")
@AllArgsConstructor
public class PasswordValidatorController {

	private PasswordValidatorService service;
	
	@PostMapping("/validation")
	@ResponseStatus(HttpStatus.OK)
	public void passwordValidation(@RequestBody Password password, @RequestHeader String lang) {
		service.validation(password, lang);
	}
	
	@PostMapping("/sampleValidation")
	@ResponseStatus(HttpStatus.OK)
	public boolean passwordSampleValidation(@RequestBody Password password) {
		try {
			service.validation(password, null);
			
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
}
