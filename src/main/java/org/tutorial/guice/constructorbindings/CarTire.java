package org.tutorial.guice.constructorbindings;

public class CarTire implements ITire {

    private float pressure;

    public CarTire(Float pressure) {
        this.pressure = pressure.floatValue();
    }

    @Override
    public float getPressure() {
        return pressure;
    }

}
