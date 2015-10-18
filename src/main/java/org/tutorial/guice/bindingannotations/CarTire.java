package org.tutorial.guice.bindingannotations;

public class CarTire implements ITire {

    private float pressure;

    public CarTire() {
        pressure = 2.4f;
    }

    public float getPressure() {
        return pressure;
    }

}
