package Creation.Builder.CarBuilder.basic;

import java.util.Random;

public class MainEntry {
    public static void main(String[] args) {
        //생성자 생성방식
        Car car1 = new Car("V7",true,"black",true,false);

        //builder 생성 방식
        Car car2 = new CarBuilder() // Method Chaining
                .setAEB(false)
                .setAirbag(false)
                .setCameraSensor(true)
                .setColor("white")
                .setEngine("V9")
                .build();

        //builder 응용
        CarBuilder carBuilder = new CarBuilder() // Method Chaining
                .setAEB(false)
                .setAirbag(false)
                .setColor("blue")
                .setEngine("V5");

        Random random = new Random();
        Car car3 = carBuilder
                .setCameraSensor(random.nextInt(2) == 0) // 50프로 확률
                .build();


        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

    }
}
