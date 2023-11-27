package com.in28minutes.rest.webservice.restfulwebservices.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created By dhhaval thakkar on 2023-10-30
 */
@Getter
@Setter
public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
