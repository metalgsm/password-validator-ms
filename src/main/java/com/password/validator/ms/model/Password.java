package com.password.validator.ms.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Password implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;
}
