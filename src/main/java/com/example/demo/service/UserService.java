package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> findAllByAge(Integer age);
    List<User> findAllByNameAndAge(String name, Integer age);
    void create(User newUser);
    void update(User user);
    List<User> findAll();
//    void delete(Set)
}
