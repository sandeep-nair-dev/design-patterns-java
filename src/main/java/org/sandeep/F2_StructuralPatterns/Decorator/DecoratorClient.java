package org.sandeep.F2_StructuralPatterns.Decorator;

//  Client
public class DecoratorClient {
    public static void main(String[] args) {
        Pepperoni customPizza1 = new Pepperoni(new ExtraCheese(new Margharita()));
        System.out.println(customPizza1.cost());

        Pepperoni customPizza2 = new Pepperoni(new Jalapenoes(new ExtraCheese(new Farmhouse())));
        System.out.println(customPizza2.cost());
    }
}
