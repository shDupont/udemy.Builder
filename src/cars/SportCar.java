package cars;

import components.CarType;
import components.Color;
import components.Enginee;
import components.Transmission;

public class SportCar {
    private final CarType carType;
    private final int seats;
    private final Enginee enginee;
    private final Transmission transmission;
    private final Color color;

    public SportCar(CarType carType, int seats, Enginee enginee, Transmission transmission, Color color) {
        this.carType = carType;
        this.seats = seats;
        this.enginee = enginee;
        this.transmission = transmission;
        this.color = color;
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

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", enginee=" + enginee.getPower() +
                ", transmission=" + transmission +
                ", color=" + color +
                '}';
    }
}
