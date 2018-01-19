package org.workforcharity.matching.models;

import java.util.Date;

public class ServiceExecutionDetail {
	public enum ServiceConsumptionStatus{requested,rejected, accepted,inprogress, completed}
	private Date start;
	private Date end;
	private Address where;
	private String serviceConsumerReference;
	private ServiceConsumptionStatus status;

}
