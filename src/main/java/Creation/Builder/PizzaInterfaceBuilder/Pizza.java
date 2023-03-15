package Creation.Builder.PizzaInterfaceBuilder;

public class Pizza {
    private String dough;
    private String topping;
    private String sauce;

    public Pizza(String dough, String topping, String sauce) { // Pizza object
        this.dough = dough;
        this.topping = topping;
        this.sauce = sauce;
    }

    public String getDough() {
        return dough;
    }

    public String getTopping() {
        return topping;
    }

    public String getSauce() {
        return sauce;
    }
}
