package com.password.validator.ms.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private String message;

    private Object detail;

    public ErrorResponse(String message) {
        this.message = message;
    }

}
