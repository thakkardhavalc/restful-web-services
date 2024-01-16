package com.in28minutes.rest.webservice.restfulwebservices.todo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By dhhaval thakkar on 2024-01-04
 */
@RestController
public class TodoResource {

    private TodoService todoService;

    public TodoResource(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("users/{username}/todos")
    public List<Todo> retrieveTodos(@PathVariable String username) {
        return todoService.findByUsername(username);
    }

    @GetMapping("users/{username}/todos/{id}")
    public Todo retrieveTodos(@PathVariable String username,
                              @PathVariable int id) {
        return todoService.findById(id);
    }

    @DeleteMapping("users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodos(@PathVariable String username,
                                            @PathVariable int id) {
        todoService.deleteById(id);
        return  ResponseEntity.noContent().build();
    }
}
