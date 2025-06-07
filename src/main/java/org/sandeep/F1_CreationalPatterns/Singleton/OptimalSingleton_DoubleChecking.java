package org.sandeep.F1_CreationalPatterns.Singleton;

public class OptimalSingleton_DoubleChecking {
    private int num;
    private static OptimalSingleton_DoubleChecking instance;

    private  OptimalSingleton_DoubleChecking(){

    }

    public static OptimalSingleton_DoubleChecking getInstance(){
        if(instance==null){
            synchronized (OptimalSingleton_DoubleChecking.class){
                if(instance==null){
                    instance = new OptimalSingleton_DoubleChecking();
                }
            }
        }
        return instance;
    }
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
}
