package org.tutorial.guice.linkedbindings;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CarTest {
	
	@Test
	public void testCarInstantiation() {
		Injector injector = Guice.createInjector(new CarModule());
		Car testCar = injector.getInstance(Car.class);
		assertTrue("object created", testCar != null);
	}

}
