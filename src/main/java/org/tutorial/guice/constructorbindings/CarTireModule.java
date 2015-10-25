package org.tutorial.guice.constructorbindings;

import com.google.inject.AbstractModule;

public class CarTireModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            bind(Float.class).toInstance(2.4f);
            bind(ITire.class).toConstructor(CarTire.class.getConstructor(Float.class));

        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }

}
