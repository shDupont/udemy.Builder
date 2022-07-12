package builders;


import cars.Car;
import components.CarType;
import components.Color;
import components.Enginee;
import components.Transmission;

public class CarBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Enginee enginee;


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


    public Car getresult(){
        return new Car(carType, seats, enginee, transmission);
    }
}
