package com.project.exception;

public class UserNotFoundException extends AbstractBaseException {
    private static final long serialVersionUID = 1567846893330865463L;

    public UserNotFoundException(final String message) {
        super(message);
    }

    @Override
    public int getStatus() {
        return 404;
    }
}