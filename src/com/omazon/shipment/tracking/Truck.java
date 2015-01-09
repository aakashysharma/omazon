package com.omazon.shipment.tracking;

public class Truck implements Delivers{
	
	private int truckID;
	private int truckName;
	@Override
	public boolean addParcel(Packet packet) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void reportIssue(String issueDescription, int delayInHours) {
		// TODO Auto-generated method stub
		
	}
	

}
