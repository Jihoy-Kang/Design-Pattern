package Creation.Builder.CarBuilder.progressive;

public class ManualCarBuilder implements CarBuilder{
    private String model; // SUV or SportsCar
    private String engine;
    private String color;
    private int seats;
    private boolean airbag;
    private boolean auto;

    @Override
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setAirbag(Boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public void setAuto() {
        this.auto = false;
    }



    @Override
    public Car build() {

        return new Car(model, engine,color,seats,airbag,auto);
    }
}
