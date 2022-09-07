package com.example.demo.bootstrap;

import com.example.demo.repository.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("pedro@hotmail.com");
        user.setPassword("123456");
        user.setFirstName("Pedro");
        user.setLastName("Diniz");

        User savedUser = userRepository.save(user);

    }
}
