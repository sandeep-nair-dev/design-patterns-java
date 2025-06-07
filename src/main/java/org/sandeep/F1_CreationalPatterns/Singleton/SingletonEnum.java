package org.sandeep.F1_CreationalPatterns.Singleton;


public enum SingletonEnum {
    INSTANCE;
    int num;

    // constructor of enum is by default private

    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
}
