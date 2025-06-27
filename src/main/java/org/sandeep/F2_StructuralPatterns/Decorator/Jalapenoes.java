package org.sandeep.F2_StructuralPatterns.Decorator;

//  ConcreteDecorator (adds behavior)
public class Jalapenoes implements ToppingDecorator{
    private BasePizza basePizza;

    public Jalapenoes(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
