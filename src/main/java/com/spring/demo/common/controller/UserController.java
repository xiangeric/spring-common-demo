package com.spring.demo.common.controller;

import com.spring.demo.common.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/call")
    public void call(){
        System.out.println("UserController#call....");
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        System.out.println("UserController#addUser....");
        System.out.println(user);
    }

    @PostMapping("/getUser")
    public User getUser(@RequestBody String name){
        System.out.println("UserController#getUser....");
        User user = new User(name,28);
        System.out.println(user);
        return user;
    }

    @PostMapping("/getAllUsers")
    public List<User> getAllUsers(){
        System.out.println("UserController#getAllUsers....");
        List list = new ArrayList();
        list.add(new User("chen eric",26));
        list.add(new User("liao e",26));
        return list;
    }





}
