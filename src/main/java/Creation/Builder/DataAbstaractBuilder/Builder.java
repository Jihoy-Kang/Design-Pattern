package Creation.Builder.DataAbstaractBuilder;

public abstract class  Builder { //추상클래스
    protected Data data;

    public Builder(Data data) {
        this.data = data;
    }

    public abstract String head(); //추상메서드
    public abstract String body();
    public abstract String foot();
}
