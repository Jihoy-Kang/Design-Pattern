package Creation.Builder.CarBuilder.progressive;

public interface CarBuilder {

    void setModel(String model);
    void setSeats(int seats);
    void setEngine(String engine);
    void setColor(String color);
    void setAirbag(Boolean airbag);
    void setAuto();



    Car build();
}
