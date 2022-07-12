package builders;

import components.CarType;
import components.Color;
import components.Enginee;
import components.Transmission;

public interface IBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Enginee enginee);
}
