import builders.CarBuilder;
import builders.SportCarBuilder;
import builders.TruckBuilder;
import cars.Car;
import cars.SportCar;
import cars.Truck;
import components.Transmission;
import director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);
        Car car = builder.getresult();
        System.out.println(car.getCarType());

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão " + truck.toString());

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);
        SportCar sportCar = sportCarBuilder.getresult();
        System.out.println(sportCar.toString());

    }
}