package org.tutorial.guice.untargetedbindings;

import com.google.inject.AbstractModule;

public class CarTireModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CarTire.class);
    }

}
