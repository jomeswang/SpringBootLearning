package com.example.demo.service.Imp;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    //    private final
    @Override
   public List<User> findAllByAge(Integer age) {
        return userRepository.findAllByAge(age);
    }

    @Override
    public List<User> findAllByNameAndAge(String name, Integer age){
        return userRepository.findAllByNameAndAge( name,  age);
    }

    @Override
    public void create(User newUser){
        userRepository.save(newUser);
    }

    @Override
    public void update(User user){
        User user1 = userRepository.findAllByAge(user.getAge()).get(0);
        user1.setAge(user.getAge());
        user1.setName(user.getName());
        userRepository.save(user1);
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
