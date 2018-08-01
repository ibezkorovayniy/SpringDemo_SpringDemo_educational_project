package com.illia.services;

import com.illia.model.User;

public interface NotificationService {

    void sendAccountActivation(User user);
}
