package Creation.Builder.CarBuilder.progressive;

public class MainEntry {
    public static void main(String[] args) {
        //SUV 생성
        Director director = new Director();
        CarBuilder carBuilder = new ManualCarBuilder();
        carBuilder.setEngine("v5");
        carBuilder.setColor("Black");
        carBuilder.setSeats(4);
        carBuilder.setAirbag(true);
        carBuilder.setAuto();

        director.setCarBuilder(carBuilder);
        director.setSuv();
        Car car = director.getCar();
        System.out.println(car.toString());

        CarBuilder carBuilder1 = new AutoCarBuilder();
        carBuilder1.setEngine("v7");
        carBuilder1.setColor("white");
        carBuilder1.setSeats(2);
        carBuilder1.setAirbag(true);
        carBuilder1.setAuto();

        Director director1 = new Director();
        director1.setCarBuilder(carBuilder1);
        director1.setSportsCar();
        Car car1 = director1.getCar();
        System.out.println(car1.toString());
    }
}
