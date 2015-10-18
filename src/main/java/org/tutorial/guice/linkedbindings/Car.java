package org.tutorial.guice.linkedbindings;

import javax.inject.Inject;

public class Car {

    private ITire frontLeft;
    private ITire frontRight;
    private ITire rearLeft;
    private ITire rearRight;

    @Inject
    public Car(ITire frontLeft, ITire frontRight, ITire rearLeft, ITire rearRight) {
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
