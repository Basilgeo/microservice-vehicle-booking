package com.ust.UserService.controller;

import com.ust.UserService.client.Booking;
import com.ust.UserService.model.User;
import com.ust.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUser() {

        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/bookAppointment")
    public ResponseEntity<Booking> bookAppointment(@RequestBody Booking booking) {
        return ResponseEntity.ok(userService.bookAppointment(booking));
    }

}
