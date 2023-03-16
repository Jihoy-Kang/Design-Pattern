package Structural.Proxy;

public class mainEntry {
    public static void main(String[] args) {
        Display display = new ScreenDisplay();

        display.print("안녕하세요");
        display.print("프록시패턴 테스트입니다.");
        display.print("프록시 없이 출력하게되면,");
        display.print("이렇게 하나씩 출력됩니다.");
        display.print("성능이 느려지는게 느껴지나요");
        display.print("프록시를 쓰면 안그래요");
        display.print("직접 체험해보시죠");

        Display display2 = new BufferProxyDisplay(5);

        display2.print("안녕하세요");
        display2.print("프록시패턴 테스트입니다.");
        display2.print("프록시 없이 출력하게되면,");
        display2.print("이렇게 하나씩 출력됩니다.");
        display2.print("성능이 느려지는게 느껴지나요");
        display2.print("프록시를 쓰면 안그래요");
        display2.print("직접 체험해보시죠");

        ((BufferProxyDisplay)display2).flush(); // 버퍼 사이즈 상관없이 일괄 출력

    }
}
