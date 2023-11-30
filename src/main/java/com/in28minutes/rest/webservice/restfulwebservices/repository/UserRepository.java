package com.in28minutes.rest.webservice.restfulwebservices.repository;

import com.in28minutes.rest.webservice.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By dhhaval thakkar on 2023-11-30
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
