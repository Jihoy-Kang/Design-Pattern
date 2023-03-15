package Creation.Builder.PizzaInterfaceBuilder;

public class MainEntry {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza("cross","sweet","ham+pineapple");
        Pizza hawaiianPizza = waiter.getPizza();


    }
}
