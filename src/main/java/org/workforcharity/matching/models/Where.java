package org.workforcharity.matching.models;

import java.util.List;

public class Where {
	public enum WhereType{NotApplicable, PhysicalAddress};
	private WhereType type;
	private List<Address> possiblePlaces;

	public WhereType getType() {
		return type;
	}

	public void setType(WhereType type) {
		this.type = type;
	}

	public List<Address> getPossiblePlaces() {
		return possiblePlaces;
	}

	public void setPossiblePlaces(List<Address> possiblePlaces) {
		this.possiblePlaces = possiblePlaces;
	}
	
}
