package org.sandeep.F1_CreationalPatterns.Singleton;

public class Singleton_Not_ThreadSafe {
    private int num;
    private static Singleton_Not_ThreadSafe instance;

    private Singleton_Not_ThreadSafe(){

    }

    public static Singleton_Not_ThreadSafe getInstance(){
        if(instance==null){
            instance = new Singleton_Not_ThreadSafe();
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
