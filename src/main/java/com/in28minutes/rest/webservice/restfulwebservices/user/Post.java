package com.in28minutes.rest.webservice.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created By dhhaval thakkar on 2023-11-30
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 10)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    @Override
    public String toString() {
        return "UserPost{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
