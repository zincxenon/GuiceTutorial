package org.tutorial.guice.bindingannotations;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CarModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ITire.class).annotatedWith(CarTireAnnotation.class).to(CarTire.class);
        bind(ITire.class).annotatedWith(Names.named("CarTireName")).to(CarTire.class);
    }

}
