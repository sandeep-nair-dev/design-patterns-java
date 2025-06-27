package org.sandeep.F2_StructuralPatterns.Decorator;

//   ConcreteComponent (original object)
public class Farmhouse implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
