package com.omazon.shipment.tracking;

public interface Delivers {
	public boolean addParcel(Packet packet);
	public void reportIssue(String issueDescription, int delayInHours);
	

}


