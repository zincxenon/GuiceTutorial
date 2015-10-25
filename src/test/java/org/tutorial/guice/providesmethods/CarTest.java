package org.tutorial.guice.providesmethods;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CarTest {

    @Test
    public void testCarInstantiation() {
        Injector injector = Guice.createInjector(new CarModule());
        Car testCar = injector.getInstance(Car.class);
        assertTrue("object created", testCar != null);
        assertEquals("tire pressure", 2.4f, testCar.getFrontLeftTire().getPressure(), 0);

    }

}
