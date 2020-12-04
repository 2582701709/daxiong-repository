package com.app.pojo;

public class ZdyApp {
    private Integer id;
	private String softwareName;
	private String APKName;
	private double softwareSize;
	private String flatformName;
	private String categoryLevel1Name;
	private String categoryLevel2Name;
	private String categoryLevel3Name;
	private String statusName;
	private Integer downloads;
	private String versionNo;
	private Integer status;
	private Integer versionId;
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public double getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(double softwareSize) {
		this.softwareSize = softwareSize;
	}
	public String getFlatformName() {
		return flatformName;
	}
	public void setFlatformName(String flatformName) {
		this.flatformName = flatformName;
	}
	public String getCategoryLevel1Name() {
		return categoryLevel1Name;
	}
	public void setCategoryLevel1Name(String categoryLevel1Name) {
		this.categoryLevel1Name = categoryLevel1Name;
	}
	public String getCategoryLevel2Name() {
		return categoryLevel2Name;
	}
	public void setCategoryLevel2Name(String categoryLevel2Name) {
		this.categoryLevel2Name = categoryLevel2Name;
	}
	public String getCategoryLevel3Name() {
		return categoryLevel3Name;
	}
	public void setCategoryLevel3Name(String categoryLevel3Name) {
		this.categoryLevel3Name = categoryLevel3Name;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Integer getDownloads() {
		return downloads;
	}
	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	@Override
	public String toString() {
		return "ZdyApp [id=" + id + ", softwareName=" + softwareName + ", APKName=" + APKName + ", softwareSize="
				+ softwareSize + ", flatformName=" + flatformName + ", categoryLevel1Name=" + categoryLevel1Name
				+ ", categoryLevel2Name=" + categoryLevel2Name + ", categoryLevel3Name=" + categoryLevel3Name
				+ ", statusName=" + statusName + ", downloads=" + downloads + ", versionNo=" + versionNo + ", status="
				+ status + ", versionId=" + versionId + "]";
	}
	
	
	
}
