package org.tutorial.guice.bindingannotations;

import com.google.inject.AbstractModule;

public class CarModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ITire.class).annotatedWith(CarTireAnnotation.class).to(CarTire.class);
    }

}
