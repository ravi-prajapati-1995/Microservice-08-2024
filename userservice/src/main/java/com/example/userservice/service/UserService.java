package com.example.userservice.service;

import java.util.List;
import com.example.userservice.model.User;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);

    String encodePassword(String password);

    boolean matchesPassword(String rawPassword, String encodedPassword);
}
