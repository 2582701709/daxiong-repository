package com.app.service;

import java.util.List;

import com.app.pojo.AppCategory;
import com.app.pojo.AppInfo;
import com.app.pojo.AppVersion;
import com.app.pojo.DataDictionary;
import com.app.pojo.Page;

public interface AppWhService {
      AppInfo selApp(int id);
      boolean addApp(AppInfo info);
      List<AppInfo> findbypage(Page page);
      List<AppInfo>  selAllApp();
      List<AppVersion> selVersion();
      List<DataDictionary> flatForm(String typeName);
      List<DataDictionary> status(String typeName);
      List<AppCategory> selAllCat();
}
