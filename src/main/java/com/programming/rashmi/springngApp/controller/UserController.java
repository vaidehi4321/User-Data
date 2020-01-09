package com.programming.rashmi.springngApp.controller;

import com.programming.rashmi.springngApp.model.User;
import com.programming.rashmi.springngApp.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
  private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public ResponseEntity<Iterable<User>> index(){
        return new ResponseEntity<>(userService.index(),HttpStatus.OK);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<User> show(@PathVariable Long id){
        return new ResponseEntity<>(userService.show(id), HttpStatus.OK);
    }
    @PostMapping("/user")
    public ResponseEntity<User> create(@RequestBody User user){
        return new ResponseEntity<>(userService.create(user),HttpStatus.CREATED);
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return new ResponseEntity<>(userService.delete(id),HttpStatus.OK);
    }

}
