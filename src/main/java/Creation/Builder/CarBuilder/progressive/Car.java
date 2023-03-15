package Creation.Builder.CarBuilder.progressive;

public class Car {


    private String model; // SUV or SportsCar
    private String engine;
    private String color;
    private int seats;
    private boolean airbag;
    private boolean auto;

    private CarBuilder carBuilder;


    public Car(String model, String engine, String color, int seats, boolean airbag, boolean auto) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.seats = seats;
        this.airbag = airbag;
        this.auto = auto;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car spec\n");
        sb.append("model         : " + model + "\n");
        sb.append("engine        : " + engine +"\n");
        sb.append("color         : " + color +"\n");
        sb.append("seats         : " + seats +"\n");
        sb.append("airbag        : " + (airbag?"Y":"N") + "\n");
        sb.append("auto          : " + (auto?"Y":"N") +"\n");
        return sb.toString();
    }
}
