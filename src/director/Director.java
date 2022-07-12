package director;

import builders.IBuilder;
import builders.SportCarBuilder;
import components.CarType;
import components.Color;
import components.Enginee;
import components.Transmission;

public class Director {
    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Enginee(1600));
    }
    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Enginee(13000));
    }

    public void constructSportCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Enginee(4000));
        ((SportCarBuilder)builder).setColor(Color.YELLOW);
    }
}
