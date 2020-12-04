package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AppWhMapper;
import com.app.pojo.AppCategory;
import com.app.pojo.AppInfo;
import com.app.pojo.AppVersion;
import com.app.pojo.DataDictionary;
import com.app.pojo.Page;
import com.app.service.AppWhService;

@Transactional
@Service("appWhService")
public class AppWhServiceImpl implements AppWhService {
    
	@Autowired
    private AppWhMapper appWhMapper;
	
	@Override
	public AppInfo selApp(int id) {
		// TODO Auto-generated method stub
	AppInfo appinfo=	appWhMapper.selApp(id);
		return appinfo;
	}

	@Override
	public boolean addApp(AppInfo info) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(appWhMapper.selApp(info.getId())!=null){
		    int num=appWhMapper.addApp(info);
		    if(num>0){
		    	flag=true;
		    }
		}
		return flag;
	}

	@Override
	public List<AppInfo> findbypage(Page page) {
		// TODO Auto-generated method stub
		List<AppInfo> list= appWhMapper.pagebyId(page);
		return list;
	}
    public List<AppInfo> selAllApp(){
    	return appWhMapper.selAllApp();
    }

	@Override
	public List<AppVersion> selVersion() {
		// TODO Auto-generated method stub
		return appWhMapper.selVersion();
	}

	@Override
	public List<DataDictionary> flatForm(String typeName) {
		// TODO Auto-generated method stub
		return appWhMapper.flatForm(typeName);
	}

	public AppWhMapper getAppWhMapper() {
		return appWhMapper;
	}

	public void setAppWhMapper(AppWhMapper appWhMapper) {
		this.appWhMapper = appWhMapper;
	}

	@Override
	public List<DataDictionary> status(String typeName) {
		// TODO Auto-generated method stub
		return appWhMapper.status(typeName);
	}

	@Override
	public List<AppCategory> selAllCat() {
		// TODO Auto-generated method stub
		return appWhMapper.selAllCat();
	}

	


}
