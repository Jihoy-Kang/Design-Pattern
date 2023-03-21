package Behavior.Strategy.Sum;

public class SumPrinter {
    void print(SumStrategy sumStrategy, int N){
        System.out.printf("The Sum of 1 - %d : ", N);
        System.out.println(sumStrategy.get(N));
    }
}
