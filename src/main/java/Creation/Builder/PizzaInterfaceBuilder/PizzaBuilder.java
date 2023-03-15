package Creation.Builder.PizzaInterfaceBuilder;

public interface PizzaBuilder { // Abstract Builder interface
    void setDough(String dough);
    void setSauce(String sauce);
    void setTopping(String topping);

    Pizza buildPizza();
}
