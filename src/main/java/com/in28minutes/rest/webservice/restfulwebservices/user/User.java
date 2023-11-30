package com.in28minutes.rest.webservice.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
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

    @Size(min = 2, message = "Name Should have at least 2 characters")
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Birth Date Should be in the past")
    @JsonProperty("birth_date")
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
