package com.app.dao;

import java.util.List;



import com.app.pojo.Dev_User;
public interface AppMapper {
	public   Dev_User selDev(int id);
    public  boolean addDev(Dev_User user);
    public  boolean delDev(int id);
     public List<Dev_User> selAll();
}
