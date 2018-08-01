package com.illia.services;

import com.illia.dao.UserDao;
import com.illia.model.ProductOrder;
import com.illia.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static com.illia.model.User.AccountStatus.ACTIVE;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    private MailService mailService;
    private NotificationService notificationService;

    @Override
    public User addUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRegisterDate(LocalDateTime.now());
        user.setActivationToken(getActivationToken());
        user.setStatus(User.AccountStatus.PENDING_ACTIVATION);
        notificationService.sendAccountActivation(user);
        userDao.addUser(user);
        user = userDao.findById(user.getId());
        return user;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User findByToken(String token) {
        return Objects.requireNonNull(userDao.findByToken(token));
    }

    @Override
    public void activate(User user) {
        user.setStatus(ACTIVE);
        userDao.updateUser(user);
    }

    private String getActivationToken() {
        return UUID.randomUUID().toString();
    }

}
