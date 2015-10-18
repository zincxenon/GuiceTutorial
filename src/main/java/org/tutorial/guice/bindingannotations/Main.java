package org.tutorial.guice.bindingannotations;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CarModule());
		Car myCar = injector.getInstance(Car.class);
		System.out.println("Tire pressure: " + myCar.getFrontLeftTire().getPressure());
	}

}
