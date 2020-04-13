package com.password.validator.ms.exception;

public class NotAcceptableException extends HttpStatusException {

    private static final long serialVersionUID = 5822417085271784230L;

    public NotAcceptableException() {
    }

    public NotAcceptableException(String message) {
        super(message);
    }
    
    public NotAcceptableException(Throwable cause) {
        super(cause);
    }

    public NotAcceptableException(String message, Throwable cause) {
        super(message, cause);
    }
    
	@Override
    public int getStatusCode() {
        return 406;
    }

}
