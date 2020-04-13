package com.password.validator.ms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.password.validator.ms.exception.RuleException;
import com.password.validator.ms.model.Password;
import com.password.validator.ms.model.PasswordRules;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PasswordValidatorService {

	public void validation(Password password, String lang) {
		Pattern allRules = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{9,}$");
		
		
		if(!allRules.matcher(password.getPassword()).lookingAt()) {
			List<PasswordRules> rules = new ArrayList<PasswordRules>();
			
			Pattern nineCharacters = Pattern.compile("^.{9,}$");
			Pattern upperCase = Pattern.compile("(?=.*[A-Z])");
			Pattern lowerCase = Pattern.compile("(?=.*[a-z])");
			Pattern digit = Pattern.compile("(?=.*\\d)");
			Pattern specialCharacter = Pattern.compile("(?=.*[@$!%*#?&])");
			
			if(!nineCharacters.matcher(password.getPassword()).lookingAt()) {
				rules.add(PasswordRules.NINE_CHARACTERS);
			}
			
			if(!upperCase.matcher(password.getPassword()).lookingAt()) {
				rules.add(PasswordRules.UPPER_CASE);
			}
			
			if(!lowerCase.matcher(password.getPassword()).lookingAt()) {
				rules.add(PasswordRules.LOWER_CASE);
			}

			if(!digit.matcher(password.getPassword()).lookingAt()) {
				rules.add(PasswordRules.DIGIT);
			}

			if(!specialCharacter.matcher(password.getPassword()).lookingAt()) {
				rules.add(PasswordRules.SPECIAL_CHARACTER);
			}
			
			new RuleException(lang, rules);
		}
	}
	
}
