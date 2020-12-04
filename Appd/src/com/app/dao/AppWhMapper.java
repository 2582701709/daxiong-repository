package com.app.dao;

import java.util.List;

import com.app.pojo.AppCategory;
import com.app.pojo.AppInfo;
import com.app.pojo.AppVersion;
import com.app.pojo.DataDictionary;
import com.app.pojo.Page;

public interface AppWhMapper {

	public AppInfo selApp(int id);
	
	public  int addApp(AppInfo info);
	
	public List<AppInfo> pagebyId(Page page);
	
	public List<AppInfo> selAllApp();
	
	public List<AppVersion> selVersion();
	
	public List<DataDictionary> flatForm(String typeName);
	
    public List<DataDictionary> status(String typeName);
    
	public List<AppCategory> selAllCat();
	
	
}
