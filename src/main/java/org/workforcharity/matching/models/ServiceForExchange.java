package org.workforcharity.matching.models;

import java.util.List;

public class ServiceForExchange {
	public enum ServiceValueType{ServiceCredit, MoneyForCharity}
	private String category;
	private String subCategory;
	private List<String> attributes;
	private String detailedDescription;
	private String serviceProviderReference;
	private When when;
	private Where where;
	private List<ServiceValueType> acceptableValueTypes;
	
	private List<ServiceExecutionDetail> executions;
	
	public void registerServiceOffer(){
		
	}
	
	public void requestForService(){
		
	}
	
	public void acceptToProvideService(){
		
	}
	
	public void confirmServiceCompleteion(){
		
	}
	
	public void rejectServiceRequest(){
		
	}
}
