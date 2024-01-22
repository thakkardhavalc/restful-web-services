package com.in28minutes.rest.webservice.restfulwebservices.todo.repository;

import com.in28minutes.rest.webservice.restfulwebservices.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created By dhhaval thakkar on 2024-01-19
 */
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUsername(String username);
}
