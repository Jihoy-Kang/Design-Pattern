package Creation.Builder.PizzaInterfaceBuilder;

public class HawaiianPizzaBuilder implements PizzaBuilder{ // concrete builder
    private String dough;
    private String topping;
    private String sauce;

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public Pizza buildPizza() {
        return new Pizza(dough, sauce, topping);
    }
}
