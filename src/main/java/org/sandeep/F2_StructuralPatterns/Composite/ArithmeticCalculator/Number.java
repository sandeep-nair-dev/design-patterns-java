package org.sandeep.F2_StructuralPatterns.Composite.ArithmeticCalculator;

public class Number implements ArithmeticExpression{
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
