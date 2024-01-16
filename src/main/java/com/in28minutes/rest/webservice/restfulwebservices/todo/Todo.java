package com.in28minutes.rest.webservice.restfulwebservices.todo;

/**
 * Created By dhhaval thakkar on 2024-01-04
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Todo {

    private int id;
    private String username;
    private String description;

    @JsonFormat(pattern = "MM-DD-YYYY")
    private LocalDate targetDate;
    private boolean done;

    public Todo() {

    }

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
                + targetDate + ", done=" + done + "]";
    }

}