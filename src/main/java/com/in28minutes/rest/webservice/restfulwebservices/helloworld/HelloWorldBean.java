package com.in28minutes.rest.webservice.restfulwebservices.helloworld;

import lombok.Getter;
import lombok.Setter;

/**
 * Created By dhhaval thakkar on 2023-10-30
 */
@Getter
@Setter
public class HelloWorldBean {
    private final String message;

    public HelloWorldBean(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
