package org.tutorial.guice.providesmethods;

import javax.inject.Inject;
import javax.inject.Named;


public class Car {

    private ITire frontLeft;
    private ITire frontRight;
    private ITire rearLeft;
    private ITire rearRight;

    @Inject
    public Car(
            // Use self defined @CarTireAnnotation (type safe)
            @CarTireAnnotation ITire frontLeft,
            @CarTireAnnotation ITire frontRight,
            // Use @Named (compiler can't check string, use with caution)
            @Named("CarTireName") ITire rearLeft,
            @Named("CarTireName") ITire rearRight) {
        super();
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.rearLeft = rearLeft;
        this.rearRight = rearRight;
    }

    public ITire getFrontLeftTire() {
        return frontLeft;
    }

    public ITire getFrontRightTire() {
        return frontRight;
    }

    public ITire getRearLeftTire() {
        return rearLeft;
    }

    public ITire getRearRightTire() {
        return rearRight;
    }

}
