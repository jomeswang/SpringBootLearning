package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 ``* 使用@Repository注解，标注这是一个持久化操作对象.
 ``*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByAge(Integer age);
    List<User> findAllByNameAndAge(String name, Integer age);

    @Override
    <S extends User> List<S> findAll(Example<S> example);
}
