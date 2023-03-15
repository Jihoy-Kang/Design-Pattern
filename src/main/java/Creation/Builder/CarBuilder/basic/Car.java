package Creation.Builder.CarBuilder.basic;

public class Car {
    private String engine;
    private boolean airbag;
    private String color;
    private boolean cameraSensor;
    private boolean AEB;

    public Car(String engine, boolean airbag, String color, boolean cameraSensor, boolean AEB) {
        this.engine = engine;
        this.airbag = airbag;
        this.color = color;
        this.cameraSensor = cameraSensor;
        this.AEB = AEB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car spec\n");
        sb.append("engine        : " + engine +"\n");
        sb.append("airbag        : " + (airbag?"Y":"N") + "\n");
        sb.append("color         : " + color +"\n");
        sb.append("camera sensor : " + (cameraSensor?"Y":"N")+ "\n");
        sb.append("AEB           : " + (AEB?"Y":"N") +"\n");
        return sb.toString();
    }
}
