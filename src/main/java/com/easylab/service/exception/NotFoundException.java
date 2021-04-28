package com.easylab.service.exception;

/**
 * @author Nasruddin
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String msg) {
        super(msg);
    }
}
