package org.tutorial.guice.instancebindings;

import javax.inject.Inject;
import javax.inject.Named;

public class CarTire {

    private float pressure;

    @Inject
    public CarTire(@Named("DefaultTirePressure") float pressure) {
        this.pressure = pressure;
    }

    public float getPressure() {
        return pressure;
    }

}
