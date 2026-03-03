package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private final UsersRepository repo;

    public UserServices(UsersRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return repo.findAll();
    }
}