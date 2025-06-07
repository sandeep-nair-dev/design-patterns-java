package org.sandeep.F1_CreationalPatterns.Singleton;

public class Singleton_ThreadSafe_ButBlocksReadsToo {
    int num;
    private static Singleton_ThreadSafe_ButBlocksReadsToo instance;

    private Singleton_ThreadSafe_ButBlocksReadsToo(){

    }

    public static synchronized Singleton_ThreadSafe_ButBlocksReadsToo getInstance(){
        if(instance==null){
            instance = new Singleton_ThreadSafe_ButBlocksReadsToo();
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
