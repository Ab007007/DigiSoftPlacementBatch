package com.digisoft.traning.basics.inheritence;

public class KIA extends Car implements Brand
{

	void logoOnCar() {
		System.out.println("comes with KIA Logo");
	}
	
	void airBags() {
		System.out.println("comes with 4 AirBags");
	}

	@Override
	public void nameofTheBrand() {
		System.out.println("Car belongs to KIA");
		
	}

	@Override
	public void policies() {
		System.out.println("Policies are under taken by KIA Org");
		
	}
}
