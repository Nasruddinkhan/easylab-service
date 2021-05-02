package com.easylab.service.exception;

import com.easylab.service.constant.ApiConstants;
import com.easylab.service.dto.ErrorDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * author : Nasruddin khan
 * description: Handle the exception globally
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private final MessageSource messageSource;
    @Autowired
    public GlobalExceptionHandler(final MessageSource messageSource) {
        super();
        this.messageSource = messageSource;
    }

    /**
     *
     * @param notValidException
     * @param headers
     * @param status
     * @param request
     * @return
     */
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException notValidException,
                                                                  final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        final Map<String, String> errors = notValidException.getBindingResult().getAllErrors().stream().collect(Collectors.toMap(error -> ((FieldError) error).getField(), DefaultMessageSourceResolvable::getDefaultMessage, (a, b) -> b));
        return new ResponseEntity<>(errors, status);
    }

    /**
     *
     * @param notFoundException
     * @param locale
     * @return
     */
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDetails> notFoundException(final NotFoundException notFoundException, final Locale locale) {
        return new ResponseEntity<>(ErrorDetails.builder().errorCode(ApiConstants.NOT_FOUND).errorMessage(messageSource.getMessage(notFoundException.getMessage(), null, locale)).date(new Date()).build(), HttpStatus.NOT_FOUND);
    }
}
