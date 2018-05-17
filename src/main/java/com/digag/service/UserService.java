package com.digag.service;

import com.digag.domain.User;
import com.digag.util.JsonResult;

import javax.servlet.http.HttpServletRequest;


public interface UserService {

    JsonResult<User> getCurrentUser(HttpServletRequest request);

}
