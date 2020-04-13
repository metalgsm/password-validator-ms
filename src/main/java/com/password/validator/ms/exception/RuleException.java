package com.password.validator.ms.exception;

import java.util.List;

import com.password.validator.ms.model.PasswordRules;

public class RuleException {

	public RuleException(String lang, List<PasswordRules> passwordRules) {
		String message = "";
		StringBuilder builder = new StringBuilder();

		if ("ptBR".equals(lang)) {
			message = "As seguintes regras não foram atendidas: ";

			passwordRules.forEach(pw -> {
				builder.append(pw.getLabelPtBr() + ", ");
			});

			message = message.concat(builder.toString());
			message = message.substring(0, message.length() - 2);

			throw new NotAcceptableException(message);
		} else {
			message = "The following rules have not been met: ";

			passwordRules.forEach(pw -> {
				builder.append(pw.getLabelEnUs() + ", ");
			});

			message = message.concat(builder.toString());
			message = message.substring(0, message.length() - 2);

			throw new NotAcceptableException(message);
		}

	}

}
