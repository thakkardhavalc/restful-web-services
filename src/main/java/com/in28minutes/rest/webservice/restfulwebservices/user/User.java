package com.in28minutes.rest.webservice.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * Created By dhhaval thakkar on 2023-10-30
 */
@Getter
@Setter
@Entity(name = "user_details")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 2, message = "Name Should have at least 2 characters")
    private String name;

    @Past(message = "Birth Date Should be in the past")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Post> posts;

    public User(Integer id, String name, LocalDate birthDate) {
        super();
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
