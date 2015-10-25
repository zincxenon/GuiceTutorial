package org.tutorial.guice.providerbindings;

import com.google.inject.AbstractModule;

public class ITireModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ITire.class).toProvider(ITireProvider.class);
    }

}
