package com.sts.service;

import com.sts.model.User;

public interface UserService {
	void registerUser(User user);
    boolean loginUser(User user);


}
