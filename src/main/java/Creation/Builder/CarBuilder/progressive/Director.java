package Creation.Builder.CarBuilder.progressive;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar(){
        return carBuilder.build();
    }

    public void setSuv(){
        carBuilder.setModel("SUV");
    }
    public void setSportsCar(){
        carBuilder.setModel("SportsCar");
    }
}
