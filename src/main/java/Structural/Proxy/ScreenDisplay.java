package Structural.Proxy;

public class ScreenDisplay implements Display {
    @Override
    public void print(String contents) {
        try{
            Thread.sleep(500); //출력 대기시간을 늘리기 위한 로직
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(contents);
    }
}
