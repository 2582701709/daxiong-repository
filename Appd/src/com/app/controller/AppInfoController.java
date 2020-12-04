package com.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.AppCategory;
import com.app.pojo.AppInfo;
import com.app.pojo.AppVersion;
import com.app.pojo.DataDictionary;
import com.app.pojo.Page;
import com.app.pojo.ZdyApp;
import com.app.service.AppWhService;
@Controller
@RequestMapping("/dev/flatform")
public class AppInfoController {
	
	@Autowired
       private AppWhService appWhService;
	
	
	
	@RequestMapping("/app/list")
	public String applist(Model model){
		//Page page=new Page(1,5,0,0);
		//List<AppInfo> applist=appWhService.selAllApp();
		//page.setTotalCount(applist.size());
		//List<AppInfo> list=appWhService.findbypage(page);
		//page.setTotalPageCount((int)(Math.ceil(applist.size()*1.0/page.getPageSize())));;
		//model.addAttribute("pages", page);
		//model.addAttribute("appInfoList",list);
	   List<DataDictionary>  flatForm=	appWhService.flatForm("所属平台");
	   List<DataDictionary>  status=	appWhService.status("APP状态");
	   List<AppCategory> cat=appWhService.selAllCat();
	   List<AppInfo> app= appWhService.selAllApp();
	    List<AppVersion> version=appWhService.selVersion();
	    List<ZdyApp> zdylist=new ArrayList<ZdyApp>();
	    List<AppCategory> categoryLevel1List=new ArrayList<AppCategory>();
	    List<AppCategory> categoryLevel2List=new ArrayList<AppCategory>();
	    List<AppCategory> categoryLevel3List=new ArrayList<AppCategory>();
	   
	    //一级二级三级输入款list数据
	    for (AppCategory appCategory : cat) {
	    	AppCategory cate=new AppCategory();
	    	if(appCategory.getParentId()==null){
	    		
	    		cate.setId(appCategory.getId());
	    		cate.setCategoryName(appCategory.getCategoryName());
	    		categoryLevel1List.add(cate);
	    	}
	    	 if(appCategory.getParentId()!=null&&appCategory.getParentId()<=2){	
			    	 cate.setId(appCategory.getId());
			    	 cate.setCategoryName(appCategory.getCategoryName());
			    	 categoryLevel2List.add(cate);   	
	    	}
	    	 if(appCategory.getParentId()!=null&&appCategory.getParentId()>2){
		    		cate.setId(appCategory.getId());
			    	 cate.setCategoryName(appCategory.getCategoryName());
			    	 categoryLevel3List.add(cate);
		    	}
	    	
		}
	    //下面数据
	    for (AppInfo a : app) {
			ZdyApp zdy=new ZdyApp();
			zdy.setAPKName(a.getAPKName());
			zdy.setSoftwareName(a.getSoftwareName());
		    for (DataDictionary b : flatForm) {
				if(a.getFlatformId()==b.getValueId()){
					zdy.setFlatformName(b.getValueName());
				}
			}
		    for(AppCategory b:cat  ){
		    	
		    	if(a.getCategoryLevel1()==b.getId()){
		    		zdy.setCategoryLevel1Name(b.getCategoryName());
		    	}
		    
		    	if(a.getCategoryLevel2()==b.getId()){
		    		zdy.setCategoryLevel2Name(b.getCategoryName());
		    	}
		    	
		    	if(a.getCategoryLevel3()==b.getId()){
		    		zdy.setCategoryLevel3Name(b.getCategoryName());
		    	}
		    	
		    }
		    for (DataDictionary c : status) {
				if(a.getStatus()==c.getValueId()){
					zdy.setStatusName(c.getValueName());
				}
			}
		    zdy.setSoftwareSize(a.getSoftwareSize());
		    zdy.setVersionId(a.getVersionId());
		    zdy.setStatus(a.getStatus());
		    zdy.setId(a.getId());
		    zdy.setDownloads(a.getDownloads());
		    for (AppVersion d : version) {
				if(a.getVersionId()==d.getId()){
					zdy.setVersionNo(d.getVersionNo());
				}
			}
		    zdylist.add(zdy);
	    }
		   
		
	  model.addAttribute("appInfoList", zdylist);
	   model.addAttribute("flatFormList",flatForm);
	   model.addAttribute("statusList",status);
	  model.addAttribute("categoryLevel1List", categoryLevel1List);
	  model.addAttribute("categoryLevel2List", categoryLevel2List);
	  model.addAttribute("categoryLevel3List", categoryLevel3List);
		return "developer/appinfolist";
	}
	
	@RequestMapping("/app/appinfoadd")
	public String appadd(){
		return "developer/appinfoadd";
	}

	public AppWhService getAppWhService() {
		return appWhService;
	}

	public void setAppWhService(AppWhService appWhService) {
		this.appWhService = appWhService;
	}

	
}
