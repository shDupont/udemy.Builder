package cars;

import components.CarType;
import components.Color;
import components.Enginee;
import components.Transmission;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Enginee enginee;
    private final Transmission transmission;

    public Car(CarType carType, int seats, Enginee enginee, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.enginee = enginee;
        this.transmission = transmission;

    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Enginee getEnginee() {
        return enginee;
    }

    public Transmission getTransmission() {
        return transmission;
    }


}
