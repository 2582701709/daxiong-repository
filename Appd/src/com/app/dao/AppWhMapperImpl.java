package com.app.dao;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.app.pojo.AppCategory;
import com.app.pojo.AppInfo;
import com.app.pojo.AppVersion;
import com.app.pojo.DataDictionary;
import com.app.pojo.Page;

@Repository
public class AppWhMapperImpl implements AppWhMapper {
	
	private SqlSessionTemplate session;
	
	@Override
	public AppInfo selApp(int id) {
		// TODO Auto-generated method stub
		AppInfo info=session.selectOne("com.app.dao.AppWh.selApp",id);
		return info;
	}

	@Override
	public int addApp(AppInfo info) {
		// TODO Auto-generated method stub
	int flag=	session.insert("com.app.dao.AppWh.selApp", info);
		return flag;
	}

	@Override
	public List<AppInfo> pagebyId(Page page) {
		// TODO Auto-generated method stub
		Object[] paramters={page.getCurrentPageNo(),page.getPageSize()};
	List<AppInfo> list=	session.selectList("com.app.dao.AppWh.pagebyId",paramters);
		return list;
	}
	public List<AppInfo> selAllApp(){
		return session.selectList("com.app.dao.AppWh.selAllApp");
	}

	@Override
	public List<AppVersion> selVersion() {
		// TODO Auto-generated method stub
		return session.selectList("com.app.dao.AppWh.selVersion");
	}

	@Override
	public List<DataDictionary> flatForm(String typeName) {
		// TODO Auto-generated method stub
		return session.selectList("com.app.dao.AppWh.flatForm", typeName);
	}

	@Override
	public List<DataDictionary> status(String typeName) {
		// TODO Auto-generated method stub
		return session.selectList("com.app.dao.AppWh.status", typeName);
	}

	@Override
	public List<AppCategory> selAllCat() {
		// TODO Auto-generated method stub
		return session.selectList("com.app.dao.AppWh.selAllCat");
	}



	

}
