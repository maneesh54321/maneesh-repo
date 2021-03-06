package com.spring.VO;

public class ResourceVO {

	private Integer resourceId;

	private String resourceName;

	private String resourceType;

	private String propagationType;

	private String lob;

	private String serviceArea;
	
	public ResourceVO() {
		super();
	}

	public ResourceVO(Integer resourceId, String resourceName, String resourceType, String propagationType,
			String lob, String serviceArea) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceType = resourceType;
		this.propagationType = propagationType;
		this.lob = lob;
		this.serviceArea = serviceArea;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getPropagationType() {
		return propagationType;
	}

	public void setPropagationType(String propagationType) {
		this.propagationType = propagationType;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}
}
