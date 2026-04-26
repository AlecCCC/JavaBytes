package com.SpringSecurityChapter2.SpringSecurityChapter2.security.service;

import com.SpringSecurityChapter2.SpringSecurityChapter2.security.entity.User;
import com.SpringSecurityChapter2.SpringSecurityChapter2.security.entity.UserResponse;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    public void registerUser(String username, String password, String authority) {

        if (userRepository.findByUsername(username).isPresent()) {
            throw new RuntimeException("User Already Exists: " + username);
        }

        User user = new User(username, passwordEncoder.encode(password), "USER");
        userRepository.save(user);
        
    }

    @Transactional
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found: " + id);
        }

        userRepository.deleteById(id);

    }

    public List<UserResponse> getUsers() {
        List<User> users = userRepository.findAll();
        List<UserResponse> result = new ArrayList<>();

        for (User user: users) {
            UserResponse response = new UserResponse(
                    user.getId(),
                    user.getUsername(),
                    user.getAuthority()
            );

            result.add(response);
        }

        return result;

    }
    
}
