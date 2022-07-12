package cars;

import components.CarType;
import components.Enginee;
import components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Enginee enginee;
    private final Transmission transmission;

    public Truck(CarType carType, int seats, Enginee enginee, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.enginee = enginee;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", enginee=" + enginee.getPower() +
                ", transmission=" + transmission +
                '}';
    }
}
