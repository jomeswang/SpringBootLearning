package com.example.demo.rest;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity getAllUser(){
        System.out.println(userService.findAll());
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("{age}")
    public ResponseEntity getUserByAge(@PathVariable Integer age){
        System.out.println((age));
        System.out.println(userService.findAllByAge(age));
        HashMap<Object, Object> map= new HashMap<Object, Object>();
        map.put("data", userService.findAllByAge(age));
        map.put("code", 200);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
