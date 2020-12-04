package com.app.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.app.pojo.Dev_User;

@Repository
public class AppMapperImpl implements AppMapper {

	 private SqlSessionTemplate session;
		@Override
		public Dev_User selDev(int id) {
			// TODO Auto-generated method stub
	     Dev_User user=		session.selectOne("com.app.dao.AppMapper.selDev", id);
			return user;
		}

		@Override
		public boolean addDev(Dev_User user) {
			// TODO Auto-generated method stub
		 int flag=  session.insert("com.app.dao.AppMapper.insDev", user);  
		 if(flag>0){
			 return true;
		 }
		 else{
			return false;
		 }
		}

		@Override
		public boolean delDev(int id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public List<Dev_User> selAll() {
			// TODO Auto-generated method stub
			List<Dev_User> list =session.selectList("com.app.dao.AppMapper.selAll");
			return list;
		}
		
}
