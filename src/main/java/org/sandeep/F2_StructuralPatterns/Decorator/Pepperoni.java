package org.sandeep.F2_StructuralPatterns.Decorator;

//  ConcreteDecorator (adds behavior)
public class Pepperoni implements ToppingDecorator{
    private BasePizza basePizza;

    public Pepperoni(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+70;
    }
}
