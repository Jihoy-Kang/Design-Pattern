package Creation.Builder.PizzaInterfaceBuilder;

public class Waiter { //Director
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.buildPizza();
    }

    public void constructPizza(String dough, String sauce, String topping){
        pizzaBuilder.setDough(dough);
        pizzaBuilder.setSauce(sauce);
        pizzaBuilder.setTopping(topping);
    }
}
