package Behavior.Iterator;


public class mainEntry {
    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU",1000),
                new Item("Monitor",800),
                new Item("Keyboard",120),
                new Item("HDD",500)
        };

        Array array = new Array(items);
        Iterator it = array.iterator();

        while (it.next()){
             Item item = (Item) it.current();
            System.out.println(item);
        }
    }
}
