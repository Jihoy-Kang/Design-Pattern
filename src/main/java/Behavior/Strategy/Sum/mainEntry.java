package Behavior.Strategy.Sum;

public class mainEntry {
    public static void main(String[] args) {
        SumPrinter cal = new SumPrinter();

        cal.print(new SimpleSumStrategy(),10);
        cal.print(new GaussSumStrategy(),10);
    }
}