package org.workforcharity.matching.models;

import java.util.Date;
import java.util.List;

public class When {
	public enum WhenType {anytime, specific, repeat};
	
	private WhenType type;
	private Date start;
	private Date end;
	private List<Integer> repeatDaysOfMonth;
	private List<Integer> repeatDaysOfWeek;
}
