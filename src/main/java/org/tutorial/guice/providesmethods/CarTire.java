package org.tutorial.guice.providesmethods;

public class CarTire implements ITire {

    private float pressure;

    void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getPressure() {
        return pressure;
    }

}
