package org.sandeep.F2_StructuralPatterns.Decorator;

//   ConcreteComponent (original object)

public class Margharita implements BasePizza{
    @Override
    public int cost() {
        return 150;
    }
}
