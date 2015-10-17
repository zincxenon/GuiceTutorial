package org.tutorial.guice.linkedbindings;

import com.google.inject.AbstractModule;

public class CarModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ITire.class).to(CarTire.class);
	}

}
