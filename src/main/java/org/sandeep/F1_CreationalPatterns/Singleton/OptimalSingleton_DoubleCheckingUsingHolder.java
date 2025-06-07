package org.sandeep.F1_CreationalPatterns.Singleton;

public class OptimalSingleton_DoubleCheckingUsingHolder {
    private int num;

    private OptimalSingleton_DoubleCheckingUsingHolder() {

    }

    private static final class InstanceHolder {
        private static final OptimalSingleton_DoubleCheckingUsingHolder instance = new OptimalSingleton_DoubleCheckingUsingHolder();
    }

    public static OptimalSingleton_DoubleCheckingUsingHolder getInstance() {
        return InstanceHolder.instance;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
