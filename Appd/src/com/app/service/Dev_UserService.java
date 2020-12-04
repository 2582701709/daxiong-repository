package com.app.service;

import java.util.List;

import com.app.pojo.Dev_User;

public interface Dev_UserService {
	Dev_User selectU(int id);
	 int addU(Dev_User user);
	 List<Dev_User> selAll();
}
