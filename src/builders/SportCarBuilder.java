package builders;

import cars.SportCar;
import cars.Truck;
import components.CarType;
import components.Color;
import components.Enginee;
import components.Transmission;

public class SportCarBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Enginee enginee;
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Enginee enginee) {
        this.enginee = enginee;
    }

    public SportCar getresult(){
        return new SportCar(carType, seats, enginee, transmission, color);
    }
}
