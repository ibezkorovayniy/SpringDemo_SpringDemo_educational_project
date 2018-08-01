package com.illia.services;

import com.illia.model.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User addUser(User user);

    User findById(Long id);

    User findByToken(String token);

    void activate(User user);
}
