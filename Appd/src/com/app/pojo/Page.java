package com.app.pojo;

public class Page {
  private int totalPageCount;
  private int currentPageNo;
  private int totalCount;
  private int pageSize;
  
  public Page(int currentPageNo,int pageSize,int totalPageCount,int totalCount){
	  this.currentPageNo=currentPageNo;
	  this.pageSize=pageSize;
	  this.totalPageCount=totalPageCount;
	  this.totalCount=totalCount;
  }

public int getTotalPageCount() {
	return totalPageCount;
}

public void setTotalPageCount(int totalPageCount) {
	this.totalPageCount = totalPageCount;
}

public int getCurrentPageNo() {
	return currentPageNo;
}

public void setCurrentPageNo(int currentPageNo) {
	this.currentPageNo = currentPageNo;
}

public int getTotalCount() {
	return totalCount;
}

public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
}

public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

@Override
public String toString() {
	return "Page [totalPageCount=" + totalPageCount + ", currentPageNo=" + currentPageNo + ", totalCount=" + totalCount
			+ ", pageSize=" + pageSize + "]";
}
  
  
}
