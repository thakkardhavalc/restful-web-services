package com.in28minutes.rest.webservice.restfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created By dhhaval thakkar on 2023-11-15
 */
@Getter
@AllArgsConstructor
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String message;
    private String details;
}
