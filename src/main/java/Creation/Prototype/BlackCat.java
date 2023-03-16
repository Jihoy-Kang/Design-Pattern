package Creation.Prototype;

public class BlackCat implements Cat, Prototype{
    private String eye;
    private String body;
    private String tail;

    public BlackCat() {
        this.eye = "black";
        this.body = "black";
        this.tail = "black";
    }

    public BlackCat setEye(String eye) {
        this.eye = eye;
        return this;
    }

    public BlackCat setBody(String body) {
        this.body = body;
        return this;
    }

    public BlackCat setTail(String tail) {
        this.tail = tail;
        return this;
    }

    @Override
    public void say() {
        System.out.printf("meow");
    }

    @Override
    public Object copy() {
        BlackCat newCat = new BlackCat();
        newCat.eye = this.eye;
        newCat.body = this.body;
        newCat.tail = this.tail;

        return newCat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cat\n");
        sb.append("eye         : " + eye + "\n");
        sb.append("body        : " + body +"\n");
        sb.append("tail        : " + tail +"\n");

        return sb.toString();
    }
}
