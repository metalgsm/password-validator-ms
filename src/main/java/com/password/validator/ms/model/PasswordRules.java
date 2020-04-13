package com.password.validator.ms.model;

public enum PasswordRules {
	NINE_CHARACTERS("Nine characters or more", "Nove caracteres ou mais"), 
	UPPER_CASE("At least 1 uppercase letter", "Ao menos 1 letra maiúscula"),
	LOWER_CASE("At least 1 lowercase letter", "Ao menos 1 letra minúscula"),
	DIGIT("At least 1 digit","Ao menos 1 dígito"),
	SPECIAL_CHARACTER("At least 1 special character", "Ao menos 1 caractere especial");
	
	private String labelEnUs;
	private String labelPtBr;
	
	PasswordRules(String labelEnUs, String labelPtBr) {
		this.labelEnUs = labelEnUs;
		this.labelPtBr = labelPtBr;
	}
	
	public String getLabelEnUs() {
		return this.labelEnUs;
	}
	
	public String getLabelPtBr() {
		return this.labelPtBr;
	}
}
