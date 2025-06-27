package org.sandeep.F2_StructuralPatterns.Decorator;

//  ConcreteDecorator (adds behavior)
public class ExtraCheese implements ToppingDecorator{

    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
