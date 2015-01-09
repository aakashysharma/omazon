package com.omazon.shipment.tracking;

public class DeliveryService {
	private DeliveryService deliveryService=null;
	
	//Singleton implementation of Delivery Service
	public DeliveryService getDeliveryService(){
		if(deliveryService==null){
			deliveryService=new DeliveryService();
		}
		return deliveryService;
	}

}
