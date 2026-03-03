package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.models.User;
import com.example.demo.repository.UsersRepository;

@Configuration
@Profile("test")
public class config implements org.springframework.boot.CommandLineRunner {
    
    @Autowired
    private UsersRepository usersRepository;

    public void run(String... args) throws Exception {
        User u1 = new User( "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
        User u2 = new User( "Alex Green", "alex@gmail.com", "977777777", "123456");
    
        usersRepository.save(u1);
        usersRepository.save(u2);
    }
}
