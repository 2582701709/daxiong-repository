package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AppMapper;
import com.app.pojo.Dev_User;
import com.app.service.Dev_UserService;
@Transactional
@Service("dev_UserService")
public class Dev_UserServiceImpl implements Dev_UserService {

	@Autowired
	private AppMapper appMapper;
	
	@Override
	public Dev_User selectU(int id) {
		// TODO Auto-generated method stub
	Dev_User user=	appMapper.selDev(id);
		return user;
	}
	@Override
	public List<Dev_User> selAll() {
		// TODO Auto-generated method stub
		return appMapper.selAll();
	}
	

	@Override
	public int addU(Dev_User user) {
		// 用户已经存在，返回-1
		if(appMapper.selDev(user.getId())!=null){
			return -1;
		}
		//用户可以添加，返回1
		if(appMapper.selDev(user.getId())==null){
			return 1;
		}
		//数据错误，返回0
		return 0;
	}

	public AppMapper getAppMapper() {
		return appMapper;
	}

	public void setAppMapper(AppMapper appMapper) {
		this.appMapper = appMapper;
	}

	
}
