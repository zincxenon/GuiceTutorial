package org.tutorial.guice.bindingannotations;

import com.google.inject.Inject;

public class Car {

    private ITire frontLeft;
    private ITire frontRight;
    private ITire rearLeft;
    private ITire rearRight;

    @Inject
    public Car(
            @CarTireAnnotation ITire frontLeft,
            @CarTireAnnotation ITire frontRight,
            @CarTireAnnotation ITire rearLeft,
            @CarTireAnnotation ITire rearRight) {
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
