package com.digag.service;

import com.digag.domain.User;
import com.digag.util.JsonResult;


public interface AuthService {

    JsonResult<User> register(User userToAdd);

    JsonResult<String> login(String username, String password);

    String refresh(String oldToken);
}
