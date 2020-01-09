package com.programming.rashmi.springngApp.service;

import com.programming.rashmi.springngApp.model.User;
import com.programming.rashmi.springngApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;

    @Autowired

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public Iterable<User> index(){
        return repository.findAll();
    }
    public User show(Long id){
        return repository.findById(id).get();
    }
    public User create(User user){
        return repository.save(user);
    }
    public Boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }

}
