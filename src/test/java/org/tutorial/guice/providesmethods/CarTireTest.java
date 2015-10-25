package org.tutorial.guice.providesmethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CarTireTest {

    @Test
    public void testCarTireInstantiation() {
        Injector injector = Guice.createInjector(new CarTireModule());
        ITire testTire = injector.getInstance(ITire.class);
        assertTrue("object created", testTire != null);
        assertEquals("tire pressure", 2.4f, testTire.getPressure(), 0);
    }

}
