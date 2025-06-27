package org.sandeep.F2_StructuralPatterns.Decorator;

//   ConcreteComponent (original object)
public class VegDelight implements BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
