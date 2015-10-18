package org.tutorial.guice.instancebindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CarTireModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Float.class).annotatedWith(Names.named("DefaultTirePressure")).toInstance(2.4f);
    }

}
